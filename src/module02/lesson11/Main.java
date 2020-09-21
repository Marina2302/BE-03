package module02.lesson11;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Mike");
        person.setCompany("Company");
        String name = null;

        try {
            Field fieldAge = Person.class.getDeclaredField("age");
            Field fieldName = Person.class.getDeclaredField("name");
            fieldAge.setAccessible(true);
            fieldName.setAccessible(true);
            name = (String) fieldName.get(person);
            fieldAge.set(person, 15);
            Method method = person.getClass().getDeclaredMethod("getCompany");
            method.setAccessible(true);
            System.out.println(name + " " + person.getAge() + " " + method.invoke(person).toString());
        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(Person.class.getDeclaredFields()));
        System.out.println(Arrays.toString(Person.class.getMethods()));
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(Person.class.getDeclaredMethods()));

        System.out.println(Modifier.isInterface(Person.class.getModifiers()));
        System.out.println(Modifier.isPublic(Person.class.getModifiers()));
        System.out.println(Modifier.isStatic(Person.class.getModifiers()));
    }


    private static Person getNewPerson() {
        Class clazz;
        Person person = null;
        try {
            clazz = Class.forName(Person.class.getName());
            person = (Person) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return person;
    }
}
