package com.mami.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidatorConstraints implements ConstraintValidator<Age,Integer> {

    private int lower;
    private int upper;

    @Override
    public void initialize(Age constraintAnnotation) {

        lower=constraintAnnotation.lower();
        upper=constraintAnnotation.upper();

    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {

        if(age==null) {
            return false;
        }

        if ( age< lower || age > upper) {
            return false;
        }

        return true;
    }
}
