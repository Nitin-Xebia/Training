 
 

// import JAXP packages
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.*;
import java.io.*;

/*
 * Program to count the number of elements using only the localName
 * component of the element, in an XML document.  Namespace names are
 * ignored here.  This example also shows one way to turn on
 * validation and how to use a SAX ErrorHandler.
 *
 * DefaultHandler is a SAX helper class that implements the SAX
 * ContentHandler interface by providing no-op methods.This class
 * overrides some of the methods by extending DefaultHandler.This program
 * turns on namespace processing and uses SAX interfaces to process XML
 * documents which may or may not be using namespaces.
 * 
 */

public class SAXNameCount extends DefaultHandler
	{
    /** Constants used for JAXP 1.2 */
    static final String JAXP_SCHEMA_LANGUAGE =
        "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    static final String W3C_XML_SCHEMA =
        "http://www.w3.org/2001/XMLSchema";
    static final String JAXP_SCHEMA_SOURCE =
        "http://java.sun.com/xml/jaxp/properties/schemaSource";

    /** A Hashtable with tag names as keys and Integers as values */
    private Hashtable tags;

    // Parser calls this once at the beginning of a document
    public void startDocument() throws SAXException 
	{
        tags = new Hashtable();
    }

    // Parser calls this for each element in a document
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts)
	throws SAXException
    {
        String key = localName;
        Object value = tags.get(key);
        if (value == null)
		{
            // Add a new entry
            tags.put(key, new Integer(1));
        }
		else 
			{
            // Get the current count and increment it
            int count = ((Integer)value).intValue();
            count++;
            tags.put(key, new Integer(count));
        }
    }

    // Parser calls this once after parsing a document
    public void endDocument() throws SAXException
	{
        Enumeration e = tags.keys();
        while (e.hasMoreElements()) {
            String tag = (String)e.nextElement();
            int count = ((Integer)tags.get(tag)).intValue();
            System.out.println("Local Name \"" + tag + "\" occurs " + count
                               + " times");
        }
    }

    /**
     * Convert from a filename to a file URL.
     */
    private static String convertToFileURL(String filename)
	{
        // On JDK 1.2 and later, simplify this to:
        // "path = file.toURL().toString()".
        String path = new File(filename).getAbsolutePath();
        if (File.separatorChar != '/') {
            path = path.replace(File.separatorChar, '/');
        }
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        return "file:" + path;
    }

    private static void usage()
	{
        System.err.println("Usage: SAXNameCount [-options] <file.xml>");
        System.err.println("       -dtd = DTD validation");
        System.err.println("       -xsd | -xsdss <file.xsd> = W3C XML Schema validation using xsi: hints");
        System.err.println("           in instance document or schema source <file.xsd>");
        System.err.println("       -xsdss <file> = W3C XML Schema validation using schema source <file>");
        System.err.println("       -usage or -help = this message");
        System.exit(1);
    }

    static public void main(String[ ] args) throws Exception
	{
        String filename = null;
        boolean dtdValidate = true;
        boolean xsdValidate = false;
        String schemaSource = null;

        // Parse arguments
        /*for (int i = 0; i < args.length; i++)
		{
            if (args[i].equals("-dtd")) {
                dtdValidate = true;
            } else if (args[i].equals("-xsd")) 
			{
                xsdValidate = true;
            } else if (args[i].equals("-xsdss"))
			 {
                if (i == args.length - 1)
				{
                    usage();
                }
                xsdValidate = true;
                schemaSource = args[++i];
            } else if (args[i].equals("-usage")) 
			{
                usage();
            } else if (args[i].equals("-help")) 
				{
                usage();
               } else 
				  {
                 filename = args[i];
                // Must be last arg
                if (i != args.length - 1)
				{
                    usage();
                }
            }
        }*/
        
        filename = "dtd/slide0.xml";
        
        if (filename == null)
		{
            usage();
        }
       
        // Create a JAXP SAXParserFactory and configure it
        SAXParserFactory spf = SAXParserFactory.newInstance();

        // Set namespaceAware to true to get a parser that corresponds to
        // the default SAX namespace feature setting.  

        spf.setNamespaceAware(true);

        // Validation part 1: set whether validation is on
        spf.setValidating(dtdValidate || xsdValidate);

        // Create a JAXP SAXParser
        SAXParser saxParser = spf.newSAXParser();

        // Validation part 2a: set the schema language if necessary
        if (xsdValidate) 
			{
            try 
				{
                saxParser.setProperty(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
               } catch (SAXNotRecognizedException x) 
				  {
                // This can happen if the parser does not support JAXP 1.2
                System.err.println(
                    "Error: JAXP SAXParser property not recognized: "
                    + JAXP_SCHEMA_LANGUAGE);
                System.err.println(
                    "Check to see if parser conforms to JAXP 1.2 spec.");
                System.exit(1);
            }
        }

        // Validation part 2b: Set the schema source, if any.  See the JAXP
        // 1.2 maintenance update specification for more complex usages of
        // this feature.
        if (schemaSource != null)
		{
            saxParser.setProperty(JAXP_SCHEMA_SOURCE, new File(schemaSource));
        }

        // Get the encapsulated SAX XMLReader
        XMLReader xmlReader = saxParser.getXMLReader();

        // Set the ContentHandler of the XMLReader
        xmlReader.setContentHandler(new SAXNameCount());//currrent class object

        // Set an ErrorHandler before parsing
        xmlReader.setErrorHandler(new MyErrorHandler(System.err));

        // Tell the XMLReader to parse the XML document
        String fileUrl =		convertToFileURL(filename);
		System.out.println("The file name converted to url is  :"+fileUrl);

        xmlReader.parse(fileUrl);
    }

    // Error handler to report errors and warnings
    private static class MyErrorHandler implements ErrorHandler 
	{
        /** Error handler output goes here */
        private PrintStream out;

        MyErrorHandler(PrintStream out)
		{
            this.out = out;
        }
        /**
         * Returns a string describing parse exception details
         */
        private String getParseExceptionInfo(SAXParseException spe)
		 {
            String systemId = spe.getSystemId();
            if (systemId == null) {
                systemId = "null";
            }
            String info = "URI=" + systemId +
                " Line=" + spe.getLineNumber() +
                ": " + spe.getMessage();
            return info;
        }

        // The following methods are standard SAX ErrorHandler methods.
        // See SAX documentation for more info.

        public void warning(SAXParseException spe) throws SAXException 
		{
            out.println("Warning: " + getParseExceptionInfo(spe));
        }
        
        public void error(SAXParseException spe) throws SAXException 
		{
            String message = "Error: " + getParseExceptionInfo(spe);
            throw new SAXException(message);
        }

        public void fatalError(SAXParseException spe) throws SAXException
		{
            String message = "Fatal Error: " + getParseExceptionInfo(spe);
            throw new SAXException(message);
        }
    }
}
