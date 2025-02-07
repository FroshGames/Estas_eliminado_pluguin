package am.FroshGames.estas_eliminado_pluguin;

import am.FroshGames.estas_eliminado_pluguin.listener.DeathMessageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Estas_eliminado_pluguin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new DeathMessageListener(), this);
        getLogger().info("¡El plugin de mensajes de muerte ha sido activado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("El plugin de mensajes de muerte ha sido desactivado.");
    }
}
