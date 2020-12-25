public class part_08 {
    public static void main(String[] args) {

        Persons person = new Persons();
        System.out.println(person.age);

        Persons person2 = new Persons("James");

    }
}

// When ever you create an object of a class that has extended another class,
// the constructor of the super class is first called before calling the
// constructor of the subclass. This is done because some attributes that may
// have been inherited need to be initialized in the constructor of the super
// class.

// By default the default constructor of the super class, Java passes the
// super() method to call the super class implicitly, you can also do this
// explicitly, is always called even
// if a parameterized constructor of the sub-class is used.

// Another way to think of this is that the super() keyword is in all the
// constructors of the sub-class hence the defualt constructor is the one that
// is called implicitly. To call a parameterized constructor you need to
// explicitly pass the super keyword and pass the parameters into the super()
// method.

// Note that the parameterized constructor of the super class can also be called
// from the default of the sub-class constructor as long as you explicitly pass
// the super keyword and pass its require parameters to the super() method.

class Males {
    int age;

    public Males() {
        this.age = 8;
        System.out.println("Alpha");
    }

    public Males(String name) {
        System.out.println(name);
    }
}

class Persons extends Males {
    public Persons() {
        System.out.println("Person");
    }

    public Persons(String name) {
        super(name);
        System.out.println(name);
    }
}
