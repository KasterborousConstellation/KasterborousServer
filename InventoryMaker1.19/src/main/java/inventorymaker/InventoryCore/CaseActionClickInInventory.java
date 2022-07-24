package inventorymaker.InventoryCore;

import org.bukkit.event.inventory.InventoryClickEvent;

public interface CaseActionClickInInventory extends CaseAction {
    /*
   Listen to click in the Inventory
    */
    abstract void ClickInInventory(InventoryClickEvent e,BasicInventory inventory);
}
