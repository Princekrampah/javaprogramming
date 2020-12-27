public class part_13 {
    // Abstract keyword when used on a class no instance of that class can be
    // created, the class can have both abstract methods and non-abstract methods,
    // when this class is extended by another class then all the abstract methods
    // from this class must be defined in the subclass.

    // When abstract keyword is used with a method, the class of the method must
    // aslo be abstract. Abstract methods do not specify a body
    public static void main(String[] args) {
        K obj = new K();
        obj.greet();
        obj.dance();
    }
}

abstract class G {
    public abstract void greet();

    public void dance() {
        System.out.println("Dance");
    }
}

class K extends G {
    public void greet() {
        System.out.println("Hello world");
    }
}




