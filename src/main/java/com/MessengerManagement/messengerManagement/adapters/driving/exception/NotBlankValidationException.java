package com.MessengerManagement.messengerManagement.adapters.driving.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotBlank;

public class NotBlankValidationException implements ConstraintValidator<NotBlank, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("The field " + context.getDefaultConstraintMessageTemplate() + " is mandatory.");
        }
        return true;
    }
}
