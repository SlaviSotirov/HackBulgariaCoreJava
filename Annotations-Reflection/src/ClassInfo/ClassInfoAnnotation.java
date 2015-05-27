package ClassInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfoAnnotation {
    String author();

    int revision() default 1;

    boolean checked() default true;

    Class<?>[] related();
}
