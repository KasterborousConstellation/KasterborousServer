package inventorymaker.InventoryUtility;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Classification {
    private final static Material[] ironTool= new Material[]{Material.IRON_AXE,Material.IRON_SWORD,Material.IRON_SHOVEL,Material.IRON_PICKAXE,Material.IRON_HOE};
    private final static Material[] diamondTool= new Material[]{Material.DIAMOND_AXE,Material.DIAMOND_SWORD,Material.DIAMOND_SHOVEL,Material.DIAMOND_PICKAXE,Material.DIAMOND_HOE};
    private final static Material[] ironArmor= new Material[]{Material.IRON_HELMET,Material.IRON_CHESTPLATE,Material.IRON_LEGGINGS,Material.IRON_BOOTS};
    private final static Material[] diamondArmor= new Material[]{Material.DIAMOND_CHESTPLATE,Material.DIAMOND_HELMET,Material.DIAMOND_LEGGINGS,Material.DIAMOND_BOOTS};
    public static boolean IsIronTool(Material material){
        for(Material mat: ironTool){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsDiamondTool(Material material){
        for(Material mat: diamondTool){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsIronTool(ItemStack itemstack){
        final Material material = itemstack.getType();
        for(Material mat: ironTool){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsDiamondTool(ItemStack itemstack){
        final Material material = itemstack.getType();
        for(Material mat: diamondTool){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsIronArmor(Material material){
        for(Material mat: ironArmor){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsDiamondArmor(Material material){
        for(Material mat: diamondArmor){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsIronArmor(ItemStack itemstack){
        final Material material = itemstack.getType();
        for(Material mat: ironArmor){
            if(mat==material)return true;
        }
        return false;
    }
    public static boolean IsDiamondArmor(ItemStack itemstack) {
        final Material material = itemstack.getType();
        for (Material mat : diamondArmor) {
            if (mat == material) return true;
        }
        return false;
    }


}
