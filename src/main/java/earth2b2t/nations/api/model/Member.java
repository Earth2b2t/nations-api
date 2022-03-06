package earth2b2t.nations.api.model;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface Member {
    UUID getUUID();

    Wallet getWallet();

    Nation getNation();

    default OfflinePlayer getOfflinePlayer() {
        return Bukkit.getOfflinePlayer(getUUID());
    }

    default Player getPlayer() {
        return Bukkit.getPlayer(getUUID());
    }
}
