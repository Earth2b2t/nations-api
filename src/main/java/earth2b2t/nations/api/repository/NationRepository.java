package earth2b2t.nations.api.repository;

import earth2b2t.nations.api.model.Member;
import earth2b2t.nations.api.model.Nation;
import earth2b2t.nations.api.util.Vec2i;

import java.util.Collection;
import java.util.Optional;

public interface NationRepository {
    Nation create(String name, Member owner, Vec2i chunk);

    Optional<Nation> findById(int id);

    Optional<Nation> findByMember(Member member);

    Optional<Nation> findByRegion(Vec2i chunk);

    Collection<Nation> findAll();
}
