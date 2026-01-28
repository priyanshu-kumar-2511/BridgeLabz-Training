package com.reflection.retriveannotationsatruntime;

/*6. Retrieve Annotations at Runtime: Create a custom annotation @Author(name="Author Name"). Apply it to a class and use Reflection to retrieve and display the annotation value at runtime.
*/

public class Main {

    public static void main(String[] args) {

        Class<BookService> clazz = BookService.class;

        if (clazz.isAnnotationPresent(Author.class)) {

            Author author = clazz.getAnnotation(Author.class);

            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("No Author annotation found.");
        }
    }
}
