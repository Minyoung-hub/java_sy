package ch07.ex03.case12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface TypeAnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodAnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface ParamAnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldAnotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Field2Anotation{
	String name();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@interface AllAnotation{
	String id();
	String pw();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnotation{
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ValueAnotation2{
	String value() default "";
}

public class Annotations {
	
}
