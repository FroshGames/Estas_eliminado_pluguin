package am.FroshGames.estas_eliminado_pluguin.listener;

import am.FroshGames.estas_eliminado_pluguin.Estas_eliminado_pluguin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DeathMessageListener implements Listener {

    private final Estas_eliminado_pluguin plugin;

    public DeathMessageListener(Estas_eliminado_pluguin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerTakeHighDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player player) {
            double damageThreshold = plugin.getConfig().getDouble("damage-threshold", 10.0);

            if (event.getDamage() >= damageThreshold) {
                String message = ChatColor.DARK_RED + "╔════════════════════╗\n" +
                        ChatColor.RED + "   ❌ " + player.getName() + " ha sido eliminado ❌\n" +
                        ChatColor.GOLD + "   🎮 ¡Gracias por jugar! 🎮\n" +
                        ChatColor.DARK_RED + "╚════════════════════╝";

                Bukkit.broadcastMessage(message);
            }
        }
    }
}
