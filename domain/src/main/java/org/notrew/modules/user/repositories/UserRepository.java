package org.notrew.modules.user.repositories;


import org.notrew.modules.user.entities.User;
import org.notrew.modules.user.entities.UserId;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void create(User device);

    void deleteById(UserId deviceId);

    Optional<User> findById(UserId anId);

    void update(User newUser);

    List<User> findAll();

}
