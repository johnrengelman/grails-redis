package grails.plugin.redis

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target
import org.codehaus.groovy.transform.GroovyASTTransformationClass

/**
 */
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(["grails.plugin.redis.ast.MemoizeASTTransformation"])
public @interface Memoize {
    Class value() default {true};
    String key() default 'memoize:null:key';
    String expire() default '';
}
