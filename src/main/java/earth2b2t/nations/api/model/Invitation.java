package earth2b2t.nations.api.model;

import java.time.LocalDateTime;

public interface Invitation {

    Member getFrom();

    Member getTo();

    LocalDateTime getExpiredAt();
}
