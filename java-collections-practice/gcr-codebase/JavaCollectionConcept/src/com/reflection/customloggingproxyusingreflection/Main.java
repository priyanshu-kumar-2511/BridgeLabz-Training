package com.reflection.customloggingproxyusingreflection;

/*10. Custom Logging Proxy Using Reflection: Implement a Dynamic Proxy that intercepts method calls on an interface (e.g., Greeting.sayHello()) and logs the method name before executing it.
*/

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(original)
        );

        proxyInstance.sayHello("Ravi");
        proxyInstance.sayGoodbye("Anita");
    }
}
