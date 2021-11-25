package com.mami.lc.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AgeValidatorConstraints.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Age {

    String message() default "{invalid}";

    int lower() default 18 ;
    int upper() default 65;
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};



}
