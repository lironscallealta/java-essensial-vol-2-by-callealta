package english.cp06otherclassfeatures.FinalKeyword;

public class TheFinalKeyword {

    public static final double SALES_VAT = 0.12; /* is not variable is constant now
    has to be initilized  */ 



}

/*
 * The `final` keyword has different effects depending on what it modifies:
 *
 * - A final class cannot be subclassed. For example, `String` is final,
 * so attempting to extend it causes a compilation error:
 *
 * class MyString extends String { } -> Error
 *
 * Declaring a class final prevents subclasses from changing or extending
 * its behavior. `String` is also designed to be immutable.
 *
 * - A final method can be inherited and used by subclasses, but it cannot
 * be overridden.
 *
 * - A final field can be assigned only once. It must be given a value,
 * either where it is declared, in an initializer, or in a constructor.
 * If it refers to an object, the reference cannot be reassigned; the
 * object's contents may still be changeable.
 *
 * A field that is both `static` and `final` is commonly used for a
 * class-level constant.
 * 
 * 
 */
