package Question2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Haiqing Bai
 * @date 2023/4/19
 */
@Target({ElementType.FIELD,ElementType.METHOD})//作用目标，字段,方法
@Retention(RetentionPolicy.RUNTIME)//作用范围，整个运行期间
public @interface StudentAnno {
    /**
     * Returns an array of the kinds of elements an annotation type
     * can be applied to.
     * @return an array of the kinds of elements an annotation type
     * can be applied to
     */
    String sno() default "000";
    String address() default "earth";
    String name() default "Anomy";
    int age() default 0;
    String sex() default "?";
}
