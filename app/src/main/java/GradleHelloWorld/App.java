/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradleHelloWorld;

public class App {
    public String getGreeting() {
        String password = "this is password";
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
