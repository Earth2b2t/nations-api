package earth2b2t.nations.api.model;

import earth2b2t.nations.api.util.Vec2i;
import earth2b2t.nations.api.util.Vec3i;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public interface Nation {

    int getId();

    String getName();

    void setName(String name);

    Wallet getWallet();

    int getDroplet();

    void setDroplet(int drop);

    Collection<Vec2i> getRegions();

    void setRegions(Collection<Vec2i> regions);

    Collection<Member> getMembers();

    void setMembers(Collection<Member> members);

    Vec3i getSpawn();

    void setSpawn(Vec3i spawn);

    Collection<Invitation> getInvitations();

    void setInvitations(Collection<Invitation> invitations);

    MemberRole getMemberRole(Member member);

    void setMemberRole(Member member, MemberRole role);

    LocalDateTime getDropletCollectedAt();

    void setDropletCollectedAt(LocalDateTime time);

    int getRegionCharge();

    void setRegionCharge(int money);

    int getIndemnity();

    void setIndemnity(int indemnity);

    LocalDateTime getIndemnityDueAt();

    void setIndemnityDueAt(LocalDateTime time);

    Nation getWarAgainst();

    void setWarAgainst(Nation nation);

    Nation getLostAgainst();

    void setLostAgainst(Nation nation);

    void delete();

    default Collection<Player> getOnlineMembers() {
        ArrayList<Player> result = new ArrayList<>();
        for (Member member : getMembers()) {
            Player player = Bukkit.getPlayer(member.getUUID());
            if (player != null) result.add(player);
        }
        return Collections.unmodifiableCollection(result);
    }
}
