package com.cxk.annotations;

import  java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author XingKe
 * @date 2019-06-14 19:05
 */
@Target({ElementType.TYPE_USE})
public @interface StudyAnnotation {
    String name();
}
