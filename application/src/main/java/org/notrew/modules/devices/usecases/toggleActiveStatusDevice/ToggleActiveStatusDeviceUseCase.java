package org.notrew.modules.devices.usecases.toggleActiveStatusDevice;

import org.notrew.modules.device.repositories.DeviceRepository;
import org.notrew.shared.contracts.InputUseCase;

public class ToggleActiveStatusDeviceUseCase extends InputUseCase<ToggleActiveStatusDeviceCommand> {
    private final DeviceRepository deviceRepository;

    public ToggleActiveStatusDeviceUseCase(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void call(ToggleActiveStatusDeviceCommand input) {
        deviceRepository.changeActiveStatus(input.id(), input.newStatus());

    }
}
