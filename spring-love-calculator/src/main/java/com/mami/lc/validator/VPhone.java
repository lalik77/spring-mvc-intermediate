package com.mami.lc.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PhoneValidatorConstraints.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface VPhone {

    String message() default "{invalidPhoneFormat}";


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
