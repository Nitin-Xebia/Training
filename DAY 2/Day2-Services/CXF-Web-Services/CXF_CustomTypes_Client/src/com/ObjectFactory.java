
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
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

    private final static QName _SubmitPO_QNAME = new QName("http://com/", "submitPO");
    private final static QName _SubmitPOResponse_QNAME = new QName("http://com/", "submitPOResponse");
    private final static QName _InvalidPOException_QNAME = new QName("http://com/", "InvalidPOException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitPOResponse }
     * 
     */
    public SubmitPOResponse createSubmitPOResponse() {
        return new SubmitPOResponse();
    }

    /**
     * Create an instance of {@link SubmitPO }
     * 
     */
    public SubmitPO createSubmitPO() {
        return new SubmitPO();
    }

    /**
     * Create an instance of {@link InvalidPOException }
     * 
     */
    public InvalidPOException createInvalidPOException() {
        return new InvalidPOException();
    }

    /**
     * Create an instance of {@link ShipmentNotice }
     * 
     */
    public ShipmentNotice createShipmentNotice() {
        return new ShipmentNotice();
    }

    /**
     * Create an instance of {@link ShipmentNotice.ItemMap }
     * 
     */
    public ShipmentNotice.ItemMap createShipmentNoticeItemMap() {
        return new ShipmentNotice.ItemMap();
    }

	/**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link ShipmentNotice.ItemMap.Entry }
     * 
     */
    public ShipmentNotice.ItemMap.Entry createShipmentNoticeItemMapEntry() {
        return new ShipmentNotice.ItemMap.Entry();
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitPO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "submitPO")
    public JAXBElement<SubmitPO> createSubmitPO(SubmitPO value) {
        return new JAXBElement<SubmitPO>(_SubmitPO_QNAME, SubmitPO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitPOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "submitPOResponse")
    public JAXBElement<SubmitPOResponse> createSubmitPOResponse(SubmitPOResponse value) {
        return new JAXBElement<SubmitPOResponse>(_SubmitPOResponse_QNAME, SubmitPOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidPOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "InvalidPOException")
    public JAXBElement<InvalidPOException> createInvalidPOException(InvalidPOException value) {
        return new JAXBElement<InvalidPOException>(_InvalidPOException_QNAME, InvalidPOException.class, null, value);
    }

}
