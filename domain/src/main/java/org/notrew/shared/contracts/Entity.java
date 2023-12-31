package org.notrew.shared.contracts;

import org.notrew.shared.validation.ValidationHandler;
import org.notrew.shared.valueObjects.Identifier;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {

    protected final ID id;


    protected Entity(final ID id) {
        Objects.requireNonNull(id, "'id' should not be null");
        this.id = id;
    }

    public abstract void validate(ValidationHandler validationHandler);

    public ID getId() {
        return id;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Entity<?> entity = (Entity<?>) o;
        return getId().equals(entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}