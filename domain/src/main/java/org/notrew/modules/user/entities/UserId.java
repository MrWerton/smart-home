package org.notrew.modules.user.entities;

import org.notrew.shared.utils.UUIDGenerator;
import org.notrew.shared.valueObjects.Identifier;

import java.util.Objects;

public class UserId extends Identifier {

    final String value;

    private UserId(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static UserId unique() {
        var idGenerated = UUIDGenerator.generate();
        return from(idGenerated);
    }

    public static UserId from(final String id) {
        return new UserId(id);
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserId userId)) return false;
        return Objects.equals(getValue(), userId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
