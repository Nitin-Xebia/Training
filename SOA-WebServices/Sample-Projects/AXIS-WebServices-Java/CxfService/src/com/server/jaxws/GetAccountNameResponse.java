
package com.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.3
 * Wed Oct 28 13:49:43 IST 2015
 * Generated source version: 3.1.3
 */

@XmlRootElement(name = "getAccountNameResponse", namespace = "http://server.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountNameResponse", namespace = "http://server.com/")

public class GetAccountNameResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

