package earth2b2t.nations.api.repository;

import earth2b2t.nations.api.model.Member;

import java.util.UUID;

public interface MemberRepository {
    Member findByUUID(UUID uuid);
}
