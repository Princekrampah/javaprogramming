public class part_05 {

    // Inner class or member class is a class that is within another class, a nested
    // class. This class is out of the global scope of the hence to create an object
    // of the inner class we nedd to first create and object of the outer class then
    // use it to create the cobject of the inner class. Note, if you want to create
    // an object of the inner class inside the inner class then you can create the
    // object the usaul way. In most cases this is what you will be doing.

    // You have seen that we need an object of the other class to create an inner
    // class what is we don't want that and we want to create and inner class
    // without the object of outer class. Is this possible, yes, just like static
    // methods we can have static classes the we can use to create an object of the
    // inner class without the need for an object of the outer class.

    /*
     * From this we can conclude that we can have 1. Member class 2. Static member
     * class 3. Annonimous class
     */

    public static void main(String[] args) {

        Myouter outerObj = new Myouter();

        Myouter.Myinner innerObj = outerObj.new Myinner();

        innerObj.greet();

        Myouter.Myinner2 obj2 = new Myouter.Myinner2();

        obj2.greet();

    }
}

class Myouter {

    class Myinner {
        public void greet() {
            System.out.println("My inner");
        }
    }

    static class Myinner2 {
        public void greet() {
            System.out.println("My inner 2");
        }
    }
}
