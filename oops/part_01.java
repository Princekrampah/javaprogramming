public class part_01 {
    public static void main(String[] args) {
        // create reference and object
        Person janet = new Person();
        janet.name = "Janet";
        janet.age = 26;
        janet.greet();
        System.out.println(janet.greeting);
    }
}

// do not use public for other classes, only do that if they are in their own
// separate file

class Person {

    String name;
    int age;
    String greeting;

    public void greet() {
        greeting = "Hello " + name + " " + age;
    }

}