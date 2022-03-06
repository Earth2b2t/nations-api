package earth2b2t.nations.api.repository;

import earth2b2t.nations.api.model.Member;
import earth2b2t.nations.api.model.Nation;
import earth2b2t.nations.api.util.Vec2i;
import earth2b2t.nations.api.util.Vec3i;

import java.util.Collection;
import java.util.Optional;

public interface NationRepository {
    Nation create(String name, Member owner, Vec2i chunk, Vec3i nexus);

    Optional<Nation> findById(int id);

    Optional<Nation> findByMember(Member member);

    Optional<Nation> findByRegion(Vec2i chunk);

    default Optional<Nation> findByRegion(Vec3i vec) {
        return findByRegion(new Vec2i(vec.getX() >> 4, vec.getZ() >> 4));
    }

    Optional<Nation> findByNexus(Vec3i pos);

    Collection<Nation> findAll();
}
