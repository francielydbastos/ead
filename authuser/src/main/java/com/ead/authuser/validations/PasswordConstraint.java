package com.ead.authuser.validations;

import com.ead.authuser.validations.impl.PasswordConstraintImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {
    String message() default """
            Invalid password! Password must contain:
            - at least one digit [0-9],
            - at least one lower case Latin character [a-z],
            - at least one uppercase Latin character [A-Z],
            - at least one special character like !@#&()-:;',?/*~$+=<>,
            - a length between 6 and 20 characters""";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
