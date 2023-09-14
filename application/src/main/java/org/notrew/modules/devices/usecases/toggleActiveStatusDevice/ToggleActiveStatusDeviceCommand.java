package org.notrew.modules.devices.usecases.toggleActiveStatusDevice;

import org.notrew.modules.device.entities.DeviceId;

public record ToggleActiveStatusDeviceCommand(DeviceId id, Boolean newStatus) {

    public static ToggleActiveStatusDeviceCommand with(final DeviceId id, boolean newStatus) {
        return new ToggleActiveStatusDeviceCommand(id, newStatus);
    }
}
