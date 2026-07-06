package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行公共字段自动填充处理
 */
// @Target 用于限制这个注解可以写在哪里,METHOD只能标注在方法上.
@Target(ElementType.METHOD)
// @Retention 决定注解活多久；RUNTIME 表示注解在程序运行时仍然存在，可以被 AOP 和反射读取。
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {

    // 数据库操作
    OperationType value();
}
