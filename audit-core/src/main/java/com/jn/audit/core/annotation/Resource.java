package com.jn.audit.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * 用在方法参数上，用于 表示被标注的 字段、参数的值就是该资源实例的 Id
 *
 * 被标注的应该是一个字符串 类型，如果不是，会被自动转为字符串
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({PARAMETER})
public @interface Resource {
    ResourceMapping[] value() default {};
}
