package com.yy.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 在自定义注解的时候可以使用@Documented来进行标注

// @Target:注解的作用目标
// @Target(ElementType.TYPE)——接口、类、枚举、注解
// @Target(ElementType.FIELD)——字段、枚举的常量
// @Target(ElementType.METHOD)——方法
// @Target(ElementType.PARAMETER)——方法参数
// @Target(ElementType.CONSTRUCTOR) ——构造函数
// @Target(ElementType.LOCAL_VARIABLE)——局部变量
// @Target(ElementType.ANNOTATION_TYPE)——注解
// @Target(ElementType.PACKAGE)——包

// @Retention：注解的保留位置
// RetentionPolicy.SOURCE:这种类型的Annotations只在源代码级别保留,编译时就会被忽略,在class字节码文件中不包含。
// RetentionPolicy.CLASS:这种类型的Annotations编译时被保留,默认的保留策略,在class文件中存在,但JVM将会忽略,运行时无法获得。
// RetentionPolicy.RUNTIME:这种类型的Annotations将被JVM保留,所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用

/**
 * 自定义注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
