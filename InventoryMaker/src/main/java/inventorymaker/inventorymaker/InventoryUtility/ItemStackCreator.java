package inventorymaker.inventorymaker.InventoryUtility;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemStackCreator {
    public static ItemStack getItem(Material material, String name, List<String> desc){
        final ItemStack stack = new ItemStack(material);
        final ItemMeta meta =stack.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(desc);
        stack.setItemMeta(meta);
        return stack;
    }
    public static ItemStack getItem(Material material, String name){
        final ItemStack stack = new ItemStack(material);
        final ItemMeta meta =stack.getItemMeta();
        meta.setDisplayName(name);
        stack.setItemMeta(meta);
        return stack;
    }
    public static ItemStack getItem(Material material, String name,int amount, List<String> desc){
        final ItemStack stack = new ItemStack(material);
        final ItemMeta meta =stack.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(desc);
        stack.setItemMeta(meta);
        stack.setAmount(amount);
        return stack;
    }
    public static ItemStack getItem(Material material, String name, int amount){
        final ItemStack stack = new ItemStack(material);
        final ItemMeta meta =stack.getItemMeta();
        meta.setDisplayName(name);
        stack.setItemMeta(meta);
        stack.setAmount(amount);
        return stack;
    }
}
