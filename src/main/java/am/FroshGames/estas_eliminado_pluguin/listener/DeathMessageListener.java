package am.FroshGames.estas_eliminado_pluguin.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DeathMessageListener implements Listener {

    @EventHandler
    public void onPlayerTakeHighDamage(EntityDamageEvent event) {
        // Verificar si la entidad es un jugador
        if (event.getEntity() instanceof Player player) {
            // Verificar si el daño recibido es mayor o igual a 20 (10 corazones)
            if (event.getDamage() >= 1) {
                String message = ChatColor.DARK_RED + "╔════════════════════╗\n" +
                        ChatColor.RED + "   ❌ " + player.getName() + " ha sido eliminado ❌\n" +
                        ChatColor.GOLD + "   🎮 ¡Gracias por jugar! 🎮\n" +
                        ChatColor.DARK_RED + "╚════════════════════╝";

                // Enviar el mensaje a todos los jugadores en el servidor
                Bukkit.broadcastMessage(message);
            }
        }
    }
}
