package org.notrew.modules.devices.usecases.changeOnlineStatus;

import org.notrew.modules.device.entities.DeviceId;

public record ChangeOnlineStatusDeviceCommand(DeviceId id, Boolean newStatus) {

    public static ChangeOnlineStatusDeviceCommand with(final DeviceId id, boolean newStatus) {
        return new ChangeOnlineStatusDeviceCommand(id, newStatus);
    }
}
