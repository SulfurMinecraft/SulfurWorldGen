package hu.jgj52.SulfurWorldGen.Listeners;

import hu.jgj52.Sulfur.Utils.Listeners.Event;
import hu.jgj52.Sulfur.Utils.Listeners.Listener;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.event.player.PlayerSpawnEvent;

public class JoinListener extends Listener {
    @Event(priority = 1)
    public void onJoin(PlayerSpawnEvent event) {
        if (!event.isFirstSpawn()) return;

        event.getPlayer().teleport(new Pos(0.5, 63, 0.5));
    }
}
