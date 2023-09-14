package org.notrew.modules.devices.usecases.create;

import org.notrew.modules.device.entities.Device;
import org.notrew.modules.device.repositories.DeviceRepository;
import org.notrew.shared.contracts.InputUseCase;

public class CreateDeviceUseCase extends InputUseCase<CreateDeviceCommand> {
    private final DeviceRepository deviceRepository;

    public CreateDeviceUseCase(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public void call(CreateDeviceCommand input) {
        var device = Device.create(input.description());
        this.deviceRepository.create(device);
    }
}
