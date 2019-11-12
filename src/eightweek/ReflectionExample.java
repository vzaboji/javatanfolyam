package eightweek;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = String.class;
        try {
            Class clazz = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String szoveg = null;
        System.out.println("szoveg: "+szoveg);
        Constructor[] constructors = c.getDeclaredConstructors();
        System.out.println("___________constructor____________");
        for (Constructor constructor : constructors){
            constructor.setAccessible(true);
            System.out.println(constructor.toGenericString());
//            if (constructor.getParameterCount()==0){
//                szoveg = (String)constructor.newInstance();
//            }
            if (constructor.getParameterCount()==1){
                szoveg = (String)constructor.newInstance("alma");
            }
        }

        System.out.println("szoveg: "+szoveg);
        Method[] methods = c.getDeclaredMethods();
        System.out.println("___________methods___________");
        for (Method method : methods){
            System.out.println(method.toGenericString());
        }
        Field[] fields = c.getDeclaredFields();
        System.out.println("___________fields____________");

        for (Field field : fields){
            System.out.println(field.toGenericString());
            if (field.getName().equals("value")) {
                field.setAccessible(true);
                char[] chars = (char[]) field.get(szoveg);
                for (char aChar : chars){
                    System.out.println(aChar);
                }
                char[] newValue = {'k','o','r','t', 'e'};
                field.set(szoveg, newValue);
            }
        }
    }

}
