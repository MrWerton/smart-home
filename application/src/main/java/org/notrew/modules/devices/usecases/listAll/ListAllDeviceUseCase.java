package org.notrew.modules.devices.usecases.listAll;

import org.notrew.modules.device.entities.Device;
import org.notrew.modules.device.repositories.DeviceRepository;
import org.notrew.shared.contracts.OutputUseCase;

import java.util.List;

public class ListAllDeviceUseCase extends OutputUseCase<List<Device>> {
    private final DeviceRepository deviceRepository;

    public ListAllDeviceUseCase(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public List<Device> call() {
        return deviceRepository.findAll();
    }
}
