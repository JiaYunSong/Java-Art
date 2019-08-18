package annotation_using;

import java.lang.annotation.Documented;

@Documented
public @interface Annotation {
	String value() default "×¢½â";
	int version();
}
