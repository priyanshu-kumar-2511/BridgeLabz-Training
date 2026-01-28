package com.reflection.dependencyinjectionusingreflection;

/*11. Dependency Injection using Reflection: Implement a simple DI container that scans classes with @Inject annotation and injects dependencies dynamically.
*/
public class Main {

    public static void main(String[] args) {

        SimpleDIContainer container = new SimpleDIContainer();

        UserService userService = container.getBean(UserService.class);

        userService.process();
    }
}
