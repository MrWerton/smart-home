package org.notrew.shared.contracts;

public abstract class DefaultUseCase<In, Out> {

    public abstract Out call(In input);
}
