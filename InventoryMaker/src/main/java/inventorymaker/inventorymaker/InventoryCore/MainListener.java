package inventorymaker.inventorymaker.InventoryCore;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
public class MainListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event){
        final Inventory inv = event.getInventory();
        final Player player = (Player)event.getWhoClicked();

        if(inv.getName().contains(InventoryMakerHandler.id)){
            final BasicInventory bInv = InventoryMakerHandler.getInventory(player);
            for(CaseAction action:bInv.getCases()[event.getSlot()].getActions()){
                if(action instanceof CaseActionClickInInventory && event.getClickedInventory().getName().contains(InventoryMakerHandler.id))
                    ((CaseActionClickInInventory)action).ClickInInventory(event,bInv);
                if(action instanceof CaseActionOnInventoryAction){
                    ((CaseActionOnInventoryAction)action).onInventoryAction(event.getAction(),event,bInv);
                }
            }
        }
    }
}
