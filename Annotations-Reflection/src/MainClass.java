import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import ClassInfo.ClassInfoAnnotation;
import ClassInfo.TestClass;



public class MainClass {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException {
        
        TestClass asd = new TestClass("asdasd", 2);
        Annotation annotation = asd.getClass().getAnnotation(ClassInfoAnnotation.class);

        System.out.println(((ClassInfoAnnotation)annotation).author());
        System.out.println(((ClassInfoAnnotation)annotation).revision());
        System.out.println(((ClassInfoAnnotation)annotation).checked());
        System.out.println(((ClassInfoAnnotation)annotation).related());
        
        Field field = asd.getClass().getDeclaredField("i");
        field.setAccessible(true);
        field.set(asd, 7);
        
        System.out.println(asd.getI());
    }

}
