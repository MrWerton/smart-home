package org.notrew.shared.contracts;

import org.notrew.shared.valueObjects.Identifier;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        super(id);
    }


}