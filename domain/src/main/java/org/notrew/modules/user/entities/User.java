package org.notrew.modules.user.entities;

import org.notrew.shared.contracts.AggregateRoot;
import org.notrew.shared.validation.ValidationHandler;

import java.time.Instant;

public class User extends AggregateRoot<UserId> {
    private final String name;
    private final String email;
    private final Instant createdAt;

    protected User(UserId userId, String name, String email, Instant createdAt) {
        super(userId);

        this.createdAt = createdAt;
        this.name = name;
        this.email = email;

    }

    public static User create(final String name, final String email) {
        final var id = UserId.unique();
        final var now = Instant.now();
        return new User(id, name, email, now);

    }


    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void validate(ValidationHandler validationHandler) {

    }
}
