package org.notrew.modules.devices.usecases.findOne;

import org.notrew.modules.device.entities.DeviceId;

public record FindOneDeviceCommand(DeviceId id) {

    public static FindOneDeviceCommand with(final DeviceId id) {
        return new FindOneDeviceCommand(id);
    }
}
