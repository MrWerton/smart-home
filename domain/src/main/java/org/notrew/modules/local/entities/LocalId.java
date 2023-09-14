package org.notrew.modules.local.entities;

import org.notrew.shared.utils.UUIDGenerator;
import org.notrew.shared.valueObjects.Identifier;

import java.util.Objects;

public class LocalId extends Identifier {

    final String value;

    private LocalId(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static LocalId unique() {
        var idGenerated = UUIDGenerator.generate();
        return from(idGenerated);
    }

    public static LocalId from(final String id) {
        return new LocalId(id);
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalId deviceId)) return false;
        return Objects.equals(getValue(), deviceId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
