package org.guzoff.traveler.model.entity;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractEntity {
    
    @Getter @Setter private int id;
    @Getter @Setter private LocalDateTime createdAt;
    @Getter @Setter private LocalDateTime modifiedAt;
    @Getter @Setter private Account createdBy;
    @Getter @Setter private Account modifiedBy;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractEntity other = (AbstractEntity) obj;
        return this.id == other.id;
    }
}
