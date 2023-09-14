package org.notrew.modules.devices.usecases.findOne;

import org.notrew.modules.device.entities.Device;
import org.notrew.modules.device.repositories.DeviceRepository;
import org.notrew.shared.contracts.DefaultUseCase;

import java.util.Optional;

public class FindOneDeviceUseCase extends DefaultUseCase<FindOneDeviceCommand, Optional<Device>> {
    private final DeviceRepository deviceRepository;

    public FindOneDeviceUseCase(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    @Override
    public Optional<Device> call(FindOneDeviceCommand input) {
        return deviceRepository.findById(input.id());
    }
}
