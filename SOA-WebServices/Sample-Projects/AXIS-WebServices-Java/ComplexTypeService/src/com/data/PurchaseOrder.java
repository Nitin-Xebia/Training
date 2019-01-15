 

package com.data;

import javax.xml.bind.annotation.XmlElement;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class PurchaseOrder {
    String orderNumber;
    String customerNumber;
    
    
    /*@XmlElement (nillable = true)
    List<Item> itemList;
    */
    Map itemList= new HashMap<String, Item>();
    
    public Map getItemList() {
		return itemList;
	}
	public void setItemList(Map itemList) {
		this.itemList = itemList;
	}
	public String getOrderNumber () { return orderNumber; }
    public void setOrderNumber (String orderNumber) { this.orderNumber = orderNumber; }
    
    public String getCustomerNumber () { return customerNumber; }
    public void setCustomerNumber (String customerNumber) { this.customerNumber = customerNumber; }
    
    /*public List<Item> getItemList () {
        if (itemList == null)
            itemList = new ArrayList<Item>();
        
        return itemList;
    }*/
}