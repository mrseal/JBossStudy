package com.cf.study.jboss.cdi;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.*;
import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ TYPE, METHOD, FIELD, PARAMETER })
public @interface Biological {

}
