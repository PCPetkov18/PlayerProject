package com.example.playerproject.validation;

import com.example.playerproject.HeadToHead;

public interface ConstraintValidator<T, T1> {
    void initialize(HeadToHead constraintAnnotation);

    boolean isValid(String headToHeadScore, ConstraintValidatorContext context);
}
