
package com.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessLoginResponse_QNAME = new QName("http://server.com/", "processLoginResponse");
    private final static QName _ProcessLogin_QNAME = new QName("http://server.com/", "processLogin");
    private final static QName _ProcessDataResponse_QNAME = new QName("http://server.com/", "processDataResponse");
    private final static QName _ProcessData_QNAME = new QName("http://server.com/", "processData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessLogin }
     * 
     */
    public ProcessLogin createProcessLogin() {
        return new ProcessLogin();
    }

    /**
     * Create an instance of {@link ProcessLoginResponse }
     * 
     */
    public ProcessLoginResponse createProcessLoginResponse() {
        return new ProcessLoginResponse();
    }

    /**
     * Create an instance of {@link ProcessData }
     * 
     */
    public ProcessData createProcessData() {
        return new ProcessData();
    }

    /**
     * Create an instance of {@link ProcessDataResponse }
     * 
     */
    public ProcessDataResponse createProcessDataResponse() {
        return new ProcessDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "processLoginResponse")
    public JAXBElement<ProcessLoginResponse> createProcessLoginResponse(ProcessLoginResponse value) {
        return new JAXBElement<ProcessLoginResponse>(_ProcessLoginResponse_QNAME, ProcessLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "processLogin")
    public JAXBElement<ProcessLogin> createProcessLogin(ProcessLogin value) {
        return new JAXBElement<ProcessLogin>(_ProcessLogin_QNAME, ProcessLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "processDataResponse")
    public JAXBElement<ProcessDataResponse> createProcessDataResponse(ProcessDataResponse value) {
        return new JAXBElement<ProcessDataResponse>(_ProcessDataResponse_QNAME, ProcessDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "processData")
    public JAXBElement<ProcessData> createProcessData(ProcessData value) {
        return new JAXBElement<ProcessData>(_ProcessData_QNAME, ProcessData.class, null, value);
    }

}
