package org.notrew.modules.local.entities;

import org.notrew.modules.environment.entities.Environment;
import org.notrew.modules.user.entities.User;
import org.notrew.shared.contracts.AggregateRoot;
import org.notrew.shared.validation.ValidationHandler;

import java.time.Instant;
import java.util.List;

public class Local extends AggregateRoot<LocalId> {
    private final String description;
    private final Instant createdAt;
    private final User owner;

    private final List<Environment> environments;

    protected Local(LocalId id, String description, List<Environment> environments, Instant createdAt, User owner) {
        super(id);
        this.owner = owner;
        this.description = description;
        this.environments = environments;
        this.createdAt = createdAt;

    }

    public static Local create(final String description, final User owner, final List<Environment> environments) {
        final var id = LocalId.unique();
        final var now = Instant.now();
        return new Local(id, description, environments, now, owner);

    }


    public String getDescription() {
        return description;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }

    public User getOwner() {
        return owner;
    }


    public List<Environment> getDevices() {
        return environments;
    }

    @Override
    public void validate(ValidationHandler validationHandler) {

    }
}
