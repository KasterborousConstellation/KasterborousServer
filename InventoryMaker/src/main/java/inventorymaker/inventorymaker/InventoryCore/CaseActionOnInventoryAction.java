package inventorymaker.inventorymaker.InventoryCore;

import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface CaseActionOnInventoryAction extends CaseAction{
    abstract void onInventoryAction(InventoryAction action, InventoryClickEvent event, BasicInventory inv);
}
