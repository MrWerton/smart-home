package org.notrew.modules.device.repositories;

import org.notrew.modules.device.entities.Device;
import org.notrew.modules.device.entities.DeviceId;

import java.util.List;
import java.util.Optional;

public interface DeviceRepository {
    void create(Device device);

    void deleteById(DeviceId deviceId);

    Optional<Device> findById(DeviceId anId);

    void update(Device newDevice);

    void changeOnlineStatus(DeviceId id, Boolean newStatus);

    void changeActiveStatus(DeviceId id, Boolean newStatus);

    List<Device> findAll();

}
