package me.erudev.spring.basic_dl.withanno.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author pengfei.zhao
 * @date 2021/4/30 9:52
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Color {
}
