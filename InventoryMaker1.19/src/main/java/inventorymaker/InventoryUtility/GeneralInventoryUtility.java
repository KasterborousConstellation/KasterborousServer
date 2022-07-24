package inventorymaker.InventoryUtility;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GeneralInventoryUtility {
    public static int getFirstStackableSpot(Inventory inv, ItemStack stack){
        int e=0;
        for(ItemStack it : inv){
            if(it==null || it.equals(stack)) {
                return e;
            }
            e++;
        }
        return -1;
    }
}
