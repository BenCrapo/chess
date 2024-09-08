
import java.util.Random; //how we get classes from specific packages. (like libraries, but with hierarchy)

public class HelloWorld {
    public static void main(String[] args) {
        Random generate = new Random(); // how we instance classes
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length()); //even constants are classes with methods inside.
        System.out.println(generate.nextInt());
        System.out.println(generate.nextInt());
    }
}