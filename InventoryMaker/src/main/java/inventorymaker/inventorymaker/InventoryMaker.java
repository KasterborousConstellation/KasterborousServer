package inventorymaker.inventorymaker;

import inventorymaker.inventorymaker.InventoryCore.MainListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class InventoryMaker extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new MainListener(),this);
        Bukkit.getLogger().log(Level.INFO,"InventoryMakerLoaded");
    }

    @Override
    public void onDisable() {

    }
}
