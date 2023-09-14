package org.notrew.modules.environment.entities;

import org.notrew.shared.utils.UUIDGenerator;
import org.notrew.shared.valueObjects.Identifier;

import java.util.Objects;

public class EnvironmentId extends Identifier {

    final String value;

    private EnvironmentId(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static EnvironmentId unique() {
        var idGenerated = UUIDGenerator.generate();
        return from(idGenerated);
    }

    public static EnvironmentId from(final String id) {
        return new EnvironmentId(id);
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnvironmentId deviceId)) return false;
        return Objects.equals(getValue(), deviceId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
