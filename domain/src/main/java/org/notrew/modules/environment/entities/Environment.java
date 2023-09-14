package org.notrew.modules.environment.entities;

import org.notrew.modules.device.entities.Device;
import org.notrew.modules.user.entities.User;
import org.notrew.shared.contracts.AggregateRoot;
import org.notrew.shared.validation.ValidationHandler;

import java.time.Instant;
import java.util.List;

public class Environment extends AggregateRoot<EnvironmentId> {
    private final String description;
    private final Instant createdAt;
    private final List<Device> devices;

    protected Environment(EnvironmentId id, String description, List<Device> devices, Instant createdAt) {
        super(id);

        this.description = description;
        this.devices = devices;
        this.createdAt = createdAt;

    }

    public static Environment create(final String description, User owner, final List<Device> devices) {
        final var id = EnvironmentId.unique();
        final var now = Instant.now();
        return new Environment(id, description, devices, now);

    }


    public String getDescription() {
        return description;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }


    public List<Device> getDevices() {
        return devices;
    }

    @Override
    public void validate(ValidationHandler validationHandler) {

    }
}
