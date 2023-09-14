package org.notrew.modules.environment.repositories;


import org.notrew.modules.environment.entities.Environment;
import org.notrew.modules.environment.entities.EnvironmentId;

import java.util.List;
import java.util.Optional;

public interface EnvironmentRepository {
    void create(Environment device);

    void deleteById(EnvironmentId deviceId);

    Optional<Environment> findById(EnvironmentId anId);

    void update(Environment newEnvironment);

    List<Environment> findAll();

}
