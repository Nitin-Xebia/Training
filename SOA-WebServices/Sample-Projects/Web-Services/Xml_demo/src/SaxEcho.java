   
 


import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;


public class SaxEcho extends DefaultHandler
{
 /*
  The default handler class implements ContentHandler, DTDHandler, EntityResolver and
  ErrorHandler interfaces
  */

    static private Writer out;
    StringBuffer textBuffer;

    public static void main(String[] argv) 
	{
        if (argv.length != 1)
		{
            System.err.println("Usage:  <filename>");
            System.exit(1);
        }

        // Use an instance of ourselves as the SAX event handler
        DefaultHandler handler = new SaxEcho();

        // Use the default (non-validating) parser
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try
			{
            // Set up output stream
            out = new OutputStreamWriter(System.out, "UTF8");
			 
			//out =  new OutputStreamWriter(new FileOutputStream("SaxOut"), "UTF8");		 
    

 
            // Parse the input
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(new File(argv[0]), handler);//handler to handle the events
        } 
		 catch (Throwable t)
		{
            t.printStackTrace();
        }

         System.exit(0);
    }

    //===========================================================
    // SAX ContentHandler methods
    //===========================================================
    public void startDocument() throws SAXException
	{
        emit("<?xml version='1.0' encoding='UTF-8'?>");
        nl();
    }

    public void endDocument() throws SAXException 
	{
        try
			{
            nl();
            out.flush();
        } 
		 catch (IOException e)
		{
            throw new SAXException("I/O error", e);
        }
    }

    public void startElement(String namespaceURI, String sName, // simple name
        String qName, // qualified name
        Attributes attrs) throws SAXException 
		{
        echoText();
        String eName = sName; // element name

        if ("".equals(eName))
		{
            eName = qName; // not namespaceAware
        }

        emit("<" + eName);

        if (attrs != null)
		{
            for (int i = 0; i < attrs.getLength(); i++) {
                String aName = attrs.getLocalName(i); // Attr name 

                if ("".equals(aName)) {
                    aName = attrs.getQName(i);
                }

                emit(" ");
                emit(aName + "=\"" + attrs.getValue(i) + "\"");
            }
        }

        emit(">");
    }

    public void endElement(String namespaceURI, String sName, // simple name
        String qName // qualified name
    ) throws SAXException 
	{
        echoText();
        String eName = sName; // element name

        if ("".equals(eName)) 
		{
            eName = qName; // not namespaceAware
        }

        emit("</" + eName + ">");
    }

    public void characters(char[ ] buf, int offset, int len)
        throws SAXException
	{
        String s = new String(buf, offset, len);

        if (textBuffer == null)
		{
            textBuffer = new StringBuffer(s);
        } 
		else 
		{
            textBuffer.append(s);
        }
    }

    // Display text accumulated in the character buffer
    private void echoText() throws SAXException
    {
        if (textBuffer == null) {
            return;
        }

        String s = "" + textBuffer;
        emit(s);
        textBuffer = null;
    }

    // Wrap I/O exceptions in SAX exceptions, to
    // suit handler signature requirements
    private void emit(String s) throws SAXException
	{
    	System.err.println("Writinng Resposne one by One");
        try
			{
            out.write(s);
            out.flush();
           } 
		    catch (IOException e)
			{
            throw new SAXException("I/O error", e);
          }
    }

    // Start a new line
    private void nl() throws SAXException
    {
        String lineEnd = System.getProperty("line.separator");
        try 
		{
            out.write(lineEnd);
        } 
		 catch (IOException e)
		{
            throw new SAXException("I/O error", e);
        }
    }
}
