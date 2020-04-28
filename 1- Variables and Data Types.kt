fun main() {
    /* ---------------------------------------------------------------------- */

    // Mutable Variables #
        // To declare a mutable variable, you use the var keyword:

    var number1 = 13
    println("number 1 = $number1")
    number1 = 12  // var can be reassigned
    println("number 1 = $number1")
    /* ---------------------------------------------------------------------- */

    // Read Only Variables #
        // To declare a read only variable, you use the val keyword:

    val number2 = 13
    println("number 2 = $number2")
    // number2 = 12  val cannot be reassigned

    /* ---------------------------------------------------------------------- */

    // Integers #
        /* There are four basic data types to store integer numbers of different
        sizes in Kotlin: */

    val type1: Byte = 127
    val type2: Short = 32767
    val type3: Int = 2147483647
    val type4: Long = 9223372036854775807

    /* ---------------------------------------------------------------------- */

    // Floating Point Numbers #
        /* Additionally, Kotlin has Float and Double to store floating point
        numbers up to different precision and sizes: */

    val float: Float = 3.4028235e38f
    val double: Double = 1.7976931348623157e308

    /* Two things to note:
    The e in both values denotes exponentiation, for instance 10e3 == 1000.
    in order to denote a Float value, you have to add the f suffix. Otherwise,
    Kotlin infers Double as the type of the number. */

    /* ---------------------------------------------------------------------- */

    // Text #
        /* Kotlin uses the Char type for single characters and String for
        arbitrary sequences of characters: */

    val character: Char = '#'
    val text: String = "Learning about Kotlin's data types"

    /*
    Single characters are denoted using single quotes '',
    whereas basic strings use double quotes "".

    However, you can also use multiline strings by wrapping
    your string into three double quotes:
    """<multiline string here>""".
     */

    /* ---------------------------------------------------------------------- */

    // Booleans #
        // Finally, Kotlin uses Boolean to store either true or false:

    val yes: Boolean = true
    val no: Boolean = false

    // These two are the only valid values for the Boolean type.

    /* ---------------------------------------------------------------------- */

    /* ----------------------------- Summary ------------------------------- */

    /* Here’s what you should take away from this lesson:

    - Kotlin has Byte, Short, Int, and Long as basic types for integer numbers.
    - Kotlin uses Float and Double for floating point numbers. A Float is denoted with a trailing f, as in 17f.
    - Kotlin has Char to store single characters and String to store strings of text.
    - Kotlin’s basic types map to Java’s primitive types when targeting the JVM (and String maps to String).
     */

    /* ---------------------------------------------------------------------- */

    // Type Inference in Kotlin #
    
    /* Kotlin’s compiler can infer the types of most variables, so adding
    the type is optional*/

    val string = "With raouf"
    val int = 27
    val long = 42L
    val double = 2.71828
    val float = 1.23f
    val bool = true

     /* Note: The terms on the left-hand side of the equals sign are just the
     variable names, not the data types. */
    
    /* ---------------------------------------------------------------------- */

    // Type Inference for Literals #
    
    /* The compiler automatically infers that the string variable must have
    type String because it’s assigned to the value "With raouf". */
    
    /*
    - For integer values, the compiler infers Int by default. You can use
    the L suffix as in 42L to transform the value into a Long.
    - Similarly, the compiler infers Double for floating point numbers unless
    you add an f as suffix as in 1.23f, in which case it is considered a Float.
    - There’s no such shortcut suffix for Byte or Short because these aren’t used as often.
    */


    /* ---------------------------------------------------------------------- */

}
