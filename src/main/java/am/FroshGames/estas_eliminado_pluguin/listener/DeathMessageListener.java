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
        // Verificar si el evento afecta a un jugador
        if (event.getEntity() instanceof Player player) {
            // Verificar si el daño recibido es mayor o igual a 20 (10 corazones)
            if (event.getDamage() >= 20) {
                String message = ChatColor.RED + player.getName() + " ha sido eliminado por recibir daño extremo.";

                // Enviar el mensaje a todos los jugadores en el servidor
                Bukkit.broadcastMessage(message);
            }
        }
    }
}
