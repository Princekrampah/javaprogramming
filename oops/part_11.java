public class part_11 {

    // Encapsulation is the process of binding a method to data(attribute), think of
    // it like a normal capsule of medice, it consists of two parts. The idea
    // behind encapsulation is that attributes or data from a given class should
    // only be accessed through the use of a method from that class. To achieve this
    // the attributes must be of type private and the methods used to access them
    // should be of type public.

    // This is where we use the concept of getters and setters. Setters set a value
    // and getters get a value.

    public static void main(String[] args) {
        James james = new James();

        james.set_age(20);
        System.out.println(james.get_age());

        james.se_pwd("123456");
        System.out.println(james.get_pwd());
    }
}

class James {
    private int age;
    private String pwd;

    public void set_age(int age) {
        this.age = age;
    }

    public int get_age() {
        return this.age;
    }

    public void se_pwd(String pwd) {
        this.pwd = pwd;
    }

    public String get_pwd() {
        return this.pwd;
    }
}
