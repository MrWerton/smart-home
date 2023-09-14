package org.notrew.shared.contracts;

public abstract class InputUseCase<In> {

    public abstract void call(In input);
}
