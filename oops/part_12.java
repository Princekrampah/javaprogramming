public class part_12 {

    // In OOP very thing must be an object, hence primitive type(c-types) must be
    // wrapped or converted to objects. This concept is known as boxing or wrapping.
    // Hence boxing or wrapping can be defined as converting primitive type to
    // object type.

    // Note the Integer, Boolean .... and all the other wrapper classes have
    // depreciated since version 9. Hence use the pattern

    // <Wrapper class>.valueOf(primitve type)

    // All of the primitive wrapper types (Boolean, Byte, Char, Short, Integer,
    // Long, Float and Double) have adopted the same pattern. In general, replace:

    // Boxing is the process of placing a primitive in an object while unboxing is
    // the process of obtaining primitive type from object type.
    public static void main(String[] args) {
        int x = 9; // primitive type

        Integer y = new Integer(x); // depreciated
        Integer z = Integer.valueOf(x); // Recommended way

        int q = z.intValue(); // unboxing or unwrapping

        Integer r = x; // Autoboxing since in the background java uses the Integer.valueOf(x) syntax.

        int t = r; // auto unboxing

        // The downside of using object types is that they are slow when it comes to
        // speed. The only reason we use then is that some frameworks use wrapper
        // classes.

        int h = Integer.parseInt("1234");
        double f = Double.parseDouble("12345");

    }
}
