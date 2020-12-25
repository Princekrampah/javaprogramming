public class part_04 {

    // static keyword with a variable, when static keyword is used with a variable
    // the variable we get created in the class loader memory meaning that all
    // objects of that class will be pointing to this variable within the class
    // loader memory instead of each object having its own value in the heap memory.
    // This mean using a single object of this class you can modify the values for
    // all other objects of this class since updating a static variable will cause
    // it to be updated in the class loader from which all other objects of that
    // class obtain that value.

    // for a non static variable each object has its own local state in the heap
    // memory while for a static variable has a single global state from which all
    // the objects of the class obtain data.

    // To update the static variable you can use any of the created objects of the
    // class to which the static method belongs or you can use the class name itself
    // which is the prefered method. This is not the case with non-static variables
    // where you must use the instance name to update the attribute.

    // The ability to update a static variable without the use of an instance is
    // very important, when we use the same concept at methods level, we can use a
    // given method from a given class without the need to create an instance or an
    // object of that class. An example is in the main method that is needed in
    // every java project

    // Static block, any code within the static block will be executed only once at
    // the time of loading the class into memory.

    // The static block will be run once at point of loading the class into memory
    // will the constructor will be executed after the class has been loaded into
    // memory, at the point of creating an object or instance. Hence the static
    // block is executed first before any constructor this does not matter the
    // sequence

    // You can not access an non-static variable inside of a static method.

    // https://www.youtube.com/watch?v=ZBJ0u9MaKtM
    // https://www.youtube.com/watch?v=QHIWkwxs0AI

    public static void main(String[] args) {
        Dbit anna = new Dbit();
        Dbit hellena = new Dbit();

        anna.stid = 20;
        hellena.stid = 90;

        System.out.println("anna: " + "stid: " + anna.stid + " sem: " + anna.sem);
        System.out.println("hellena: " + "stid: " + hellena.stid + " sem: " + hellena.sem);

        anna.sem = "sem 2";

        System.out.println("anna: " + "stid: " + anna.stid + " sem: " + anna.sem);
        System.out.println("hellena: " + "stid: " + hellena.stid + " sem: " + hellena.sem);

        Dbit.sem = "sem 3";

        System.out.println("anna: " + "stid: " + anna.stid + " sem: " + anna.sem);
        System.out.println("hellena: " + "stid: " + hellena.stid + " sem: " + hellena.sem);

    }
}

class Dbit {
    static String sem = "sem 1";
    int stid;

    static {
        System.out.println("Static block");
    }

    public Dbit() {
        System.out.println("Constructor called");
    }
}
