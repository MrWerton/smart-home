package org.notrew.modules.local.repositories;


import org.notrew.modules.local.entities.Local;
import org.notrew.modules.local.entities.LocalId;

import java.util.List;
import java.util.Optional;

public interface LocalRepository {
    void create(Local device);

    void deleteById(LocalId deviceId);

    Optional<Local> findById(LocalId anId);

    void update(Local newLocal);

    List<Local> findAll();

}
