package univth.portfolio.common.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by TaeHwan
 * 2017. 7. 10. AM 8:51
 */
@MappedSuperclass
public abstract class AbstractTimestampEntity{
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false)
    private Date updated;

    @PrePersist
    protected void onCreate() {
        updated = created = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }
}