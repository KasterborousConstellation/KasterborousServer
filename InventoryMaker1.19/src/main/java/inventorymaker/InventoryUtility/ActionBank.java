package inventorymaker.InventoryUtility;

import inventorymaker.InventoryCore.BasicInventory;
import inventorymaker.InventoryCore.CaseActionClickInInventory;
import inventorymaker.InventoryCore.CaseActionOnInventoryAction;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ActionBank {
    public static CaseActionClickInInventory preventClick= new CaseActionClickInInventory() {
        @Override
        public void ClickInInventory(InventoryClickEvent e, BasicInventory inventory) {
            e.setCancelled(true);
        }
    };
    public static CaseActionOnInventoryAction preventAction = new CaseActionOnInventoryAction() {
        @Override
        public void onInventoryAction(InventoryAction action, InventoryClickEvent event, BasicInventory inv) {
            if(action!=InventoryAction.COLLECT_TO_CURSOR){
                event.setCancelled(true);
            }else{
                inv.observer.sendMessage("Not Prevented");
            }
        }
    };



}
