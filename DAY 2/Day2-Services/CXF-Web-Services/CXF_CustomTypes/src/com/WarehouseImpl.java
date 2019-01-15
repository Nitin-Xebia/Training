 

package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService
    public class WarehouseImpl {
    
    /**
     * @param PurchaseOrder
     * @throws InvalidPOException  if the item list in the PurchaseOrder is null
     */
    public ShipmentNotice submitPO (PurchaseOrder po) throws InvalidPOException {
        if (po.getItemList () == null) {
            throw new InvalidPOException ("Invalid Item List");
        }
        
        // warehouse processes the PurchaseOrder
        // and prepares a list of items that are shipped back
        
        ShipmentNotice shipmentNotice = new ShipmentNotice ();
        shipmentNotice.setOrderNumber (po.getOrderNumber ());
        shipmentNotice.setCustomerNumber (po.getCustomerNumber ());
        shipmentNotice.setShipmentNumber ("ABC-12345-XYZ");
        List<Item> itemList = shipmentNotice.getItemList ();
        
        Map map = new HashMap<String, Item>();
        int itemNumber = 1;
        
        for (Item item : po.getItemList ()) {
        	itemNumber++;
            itemList.add (item);
            map.put("Item "+itemNumber, item);
        }
        
        return shipmentNotice;
    }
}


