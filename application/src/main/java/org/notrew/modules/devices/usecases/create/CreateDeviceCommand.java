package org.notrew.modules.devices.usecases.create;

public record CreateDeviceCommand(String description) {

    public static CreateDeviceCommand with(final String description) {
        return new CreateDeviceCommand(description);
    }
}
