package org.notrew.modules.device.entities;

import org.notrew.shared.validation.Error;
import org.notrew.shared.validation.ValidationHandler;
import org.notrew.shared.validation.Validator;

public class DeviceValidator extends Validator {
    private final Device device;

    protected DeviceValidator(Device device, ValidationHandler aHandler) {
        super(aHandler);
        this.device = device;
    }

    @Override
    public void validate() {
        if (device.getDescription().isBlank()) {
            this.validationHandler().append(new Error("not should be null"));
        }
    }
}
