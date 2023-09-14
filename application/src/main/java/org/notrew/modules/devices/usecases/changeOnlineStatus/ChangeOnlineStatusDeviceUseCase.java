package org.notrew.modules.devices.usecases.changeOnlineStatus;

import org.notrew.modules.device.repositories.DeviceRepository;
import org.notrew.shared.contracts.InputUseCase;

public class ChangeOnlineStatusDeviceUseCase extends InputUseCase<ChangeOnlineStatusDeviceCommand> {
    private final DeviceRepository deviceRepository;

    public ChangeOnlineStatusDeviceUseCase(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void call(ChangeOnlineStatusDeviceCommand input) {
        deviceRepository.changeOnlineStatus(input.id(), input.newStatus());

    }
}
