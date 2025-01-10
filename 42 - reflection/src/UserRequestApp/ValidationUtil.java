package UserRequestApp;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void ValidationReflection(Object object){

        // mengambil class
        Class aClass = object.getClass();
        // menambil semua field (baik yang privat maupun public)
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields){
            field.setAccessible(true);  // memaksa semua field biarpun privat bisa diakses

            if ((field.getAnnotation(NotBlank.class) != null)) {
                // validated
                try {
                    String fieldName = (String) field.get(object);

                    if (fieldName == null || fieldName.isBlank()){
                        throw new NullPointerException(field.getName() + " is null or blank");
                    }

                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field : " + e.getMessage());
                }

            }
        }
    }
}
