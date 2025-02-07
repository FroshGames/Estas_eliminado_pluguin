package am.FroshGames.estas_eliminado_pluguin;

import am.FroshGames.estas_eliminado_pluguin.listener.DeathMessageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Estas_eliminado_pluguin extends JavaPlugin {

    private static Estas_eliminado_pluguin instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig(); // Cargar o crear el archivo de configuración

        getServer().getPluginManager().registerEvents(new DeathMessageListener(this), this);
        getLogger().info("¡El plugin de mensajes de muerte ha sido activado correctamente!");
    }

    @Override
    public void onDisable() {
        getLogger().info("El plugin de mensajes de muerte ha sido desactivado.");
    }

    public static Estas_eliminado_pluguin getInstance() {
        return instance;
    }
}
