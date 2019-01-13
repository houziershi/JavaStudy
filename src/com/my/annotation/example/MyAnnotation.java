package com.my.annotation.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by guokun on 2019/1/13.
 * Description: Annotation在反射中的使用
 * @param
 * @return
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
     String[] value() default "unknown";
}
