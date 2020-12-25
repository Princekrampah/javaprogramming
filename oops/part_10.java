public class part_10 {
    // Dynamic method dispatch

    // using method overriding we can achieve Runtime Polymorphism

    // Dynamic Method Dispatch is a mechanism that decides which overriden method
    // gets called at runtime

    // Here we use the reference of the super class to and an object of the
    // subclass.

    // Basing on the object, DMD will decide on which overriden method to use.

    // Note if you create a ref of super class and an object of subclass you can
    // only call the methods of the super class that have been overriden in the
    // subclass.

    // Dynamic method dispatch is just like a normal method overriding except you
    // can only call the methods that have been defined in the super call or the
    // class used to create the reference. You can not call methods that only exist
    // in the class used to create the object. Basically use can only call the
    // methods that are in the super class but this methods will be applied to the
    // object of the subclass.
    public static void main(String[] args) {
        C obj = new D(); // this is run time polymorphism cause, the ref and obj will only be linked at
                         // run time. Hence which method to be called will also be determined at run
                         // time, this is called Dynamic Method Dispatch, hence to achieve Dynamic Method
                         // Dispatch we need to use runtime polymorphism.

        obj.call();

        obj = new E();
        obj.call(); // Dynamic Method Dispatch,it's called this because the the ref stays the same
                    // but the method being called depends on the object to which the ref is
                    // assigned to .
        obj.callNotE();
        // obj.callNotC();
    }
}

class C {
    public void call() {
        System.out.println("in call C");
    }

    public void callNotE() {
        System.out.println("in call not E");
    }
}

class D extends C {
    @Override
    public void call() {
        System.out.println("in call D");
    }
}

class E extends C {
    @Override
    public void call() {
        System.out.println("in call E");
    }

    public void callNotC() {
        System.out.println("in call not C");
    }
}
