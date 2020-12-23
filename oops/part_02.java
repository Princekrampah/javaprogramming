public class part_02 {

    // in java, the starting point of execusion is main method, at the starting
    // point of execution you can not create and object and in java you need an
    // object to call a method like the main method right? That is the reason why we
    // need a class with a method we can call without creating an object of that
    // class.

    // in java to create an object we need to create an instance then use the new
    // keyword which creates memory in the heap(where objects are stored), but how
    // much memory should be created? This is where the constructor comes in. A
    // constructor is a member method having the same name as the class. All classes
    // in java have a constructor where you explicitly specify it or not. A
    // constructor must be the same name as the class name, must be of public and
    // have not return type. The constructor is called implicitly everytime an
    // object is created. Every code in the constructor is executed once at the
    // point of object creation.

    // We can have two constructors in the same class provided that they have
    // different signatures, this means different parameters must be passed.

    // Constructors can be of two types the default constructor, this is is the one
    // without a parameter. Parameterized contructors this is the one with a
    // parameter.

    // when using a parameterized constructor, use the this keyword to prefix the
    // instance variables because, the local state overrides the gloabl space
    // especially when the parameter of a constructor has the same name as the
    // instance variable

    public static void main(String[] args) {

        Person2 janet = new Person2();
        Person2 janet2 = new Person2("Janet");

    }
}

class Person2 {

    public Person2() {
        System.out.println("Constructor 1");
    }

    public Person2(String name) {
        System.out.println("Constructor " + name);
    }

    public void greet() {
        System.out.println("Hello world");
    }
}