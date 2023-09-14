package org.notrew.modules.device.entities;

import org.notrew.shared.utils.UUIDGenerator;
import org.notrew.shared.valueObjects.Identifier;

import java.util.Objects;

public class DeviceId extends Identifier {

    final String value;

    private DeviceId(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static DeviceId unique() {
        var idGenerated = UUIDGenerator.generate();
        return from(idGenerated);
    }

    public static DeviceId from(final String id) {
        return new DeviceId(id);
    }

    @Override
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceId deviceId)) return false;
        return Objects.equals(getValue(), deviceId.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
