package com.example.playerproject;

import com.example.playerproject.validation.Head2HeadConstraintValidator;

public @interface Constraint {
    Class<Head2HeadConstraintValidator> validatedBy();
}
