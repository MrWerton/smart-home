package org.notrew.modules.device.entities;

import org.notrew.shared.contracts.AggregateRoot;
import org.notrew.shared.validation.ValidationHandler;
import org.notrew.shared.validation.handler.Notification;

import java.time.Instant;

public class Device extends AggregateRoot<DeviceId> {
    private final String description;
    private final Instant createdAt;
    private final Boolean turnedOn;
    private final Boolean isOnline;

    protected Device(DeviceId deviceId, String description, Boolean isOnline, Boolean turnedOn, Instant createdAt) {
        super(deviceId);
        this.description = description;
        this.isOnline = isOnline;
        this.turnedOn = turnedOn;
        this.createdAt = createdAt;
        this.selfValidation();
    }

    public static Device create(final String description) {
        final var id = DeviceId.unique();
        final var now = Instant.now();
        return new Device(id, description, true, false, now);

    }


    public String getDescription() {
        return description;
    }


    public Boolean getOnline() {
        return isOnline;
    }

    public Boolean isTurnedOn() {
        return turnedOn;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    private void selfValidation() {
        var notification = Notification.create();

        validate(notification);
    }


    @Override
    public void validate(ValidationHandler validationHandler) {
        new DeviceValidator(this, validationHandler).validate();
    }
}
