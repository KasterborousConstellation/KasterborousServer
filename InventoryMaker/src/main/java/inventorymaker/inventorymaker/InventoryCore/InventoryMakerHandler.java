package inventorymaker.inventorymaker.InventoryCore;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;
public class InventoryMakerHandler {
    public static String id ="§a§1§3§r";
    public static HashMap<UUID, BasicInventory> inventory = new HashMap<>();

    public static  BasicInventory getInventory(Player player){
        return inventory.get(player.getUniqueId());
    }

}
