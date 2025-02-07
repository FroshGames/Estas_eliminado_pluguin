package am.FroshGames.estas_eliminado_pluguin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMessageListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (event.getEntity() != null && event.getEntity().getPlayer() != null) {
            event.setDeathMessage("§cEstás eliminado.");
        }
    }
}
