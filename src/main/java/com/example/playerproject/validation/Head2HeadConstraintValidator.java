package com.example.playerproject.validation;

import com.example.playerproject.HeadToHead;
import com.example.springmvcconfiguration.HeadToHead;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Head2HeadConstraintValidator implements ConstraintValidator<HeadToHead, String> {


    @Override
    public void initialize(HeadToHead constraintAnnotation) {
    }

    @Override
    public boolean isValid(String headToHeadScore, ConstraintValidatorContext context) {
        boolean isValid = headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
        return isValid;
    }
}