package com.company;

//Import ArrayList class inside of the java.util package
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
//Import all classes inside the java.security package
import java.security.*;
import java.util.Scanner;

public class LearnJava {

    //in order to run a java program, it must have a main method as an entry point
    public static void main(String[] args) {
	// Input/Output

       /*
       output
        */

       //Use System.out.println() to print lines.
        System.out.println("Pyrax First Java Code");
        System.out.println(
                "Integer: " + 10 +
                " Double: " + 3.14 +
                " Boolean: "+ true);

        //To print without a new line, use System.out.print().
        System.out.print(" Pyrax ");
        System.out.print(" Technologies ");

        //Use System.out.printf() for easy formatted printing.
        System.out.printf("pi = %.5f", Math.PI); // => 3.14159

        /*
        Input
         */

        //use Scanner to read Input
        // Must import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        //Read a string input
        String name = scanner.next();

        //Read a byte input
        byte numByte = scanner.nextByte();

        //Read int input
        int numInt = scanner.nextInt();

        //Read a long input
        float numFloat = scanner.nextFloat();

        //Read Double input
        double numDouble = scanner.nextDouble();

        //Read a boolean input
        boolean bool = scanner.nextBoolean();


        //////////////////////////////////////////
        //Variables
        /////////////////////////////////////////


        /*
        /* Variable Declarations
         */


        // Declare a variable using <type> <name>
        int fooInt;
        //Declare multiple variables of the same
        //type <type> <name1> <name2> <name3>
        int fooInt1, fooInt2, fooInt3;

        /*
        /* Variable Initialization
         */

        //Initialize a variable using <type> <name> = <val>
        int barInt = 1;
        //Initialize multiple of the same type with same
        //value <type> <name1>, <name2>, <name3>
        //<name1> = <name2> = <name3> = <val>
        int barInt1, barInt2, barInt3;
        barInt1 = barInt2 = barInt3 = 1;

        /*
        * Variable types
         */
        // Byte - 8-bit signed two's complement integer
        // (-128 <= byte <=127)
        byte fooByte = 100;

        // If you would like to implement a byte as unsigned integer
        //then this simple operation may help
        int unsignedIntLessThan256 = 0xff & fooByte;
        // This contrasts a cast which can be negative.
        int signedInt = (int) fooByte;

        //short - 16-bit signed two's complement integer
        // (-32,768 <= short <= 32767)
        short fooShort = 10000;

        // Integer - 32-bit signed two's complement integer
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int bazInt = 1;

        // Long - 64-bit signed two's complement integer
        // (-9,223,372,036,854,775,808 <= Long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        //L is used to denote tha this variable value is of type long;
        //anything without is treated as integer by default

        //Note: byte, short,int and long are signed. They can have positive and negative values
        // There are no unsigned variants.
        // char, however, is 16-bit unsigned.

        //Float - Single-precision 32-bit IEEE 754 Floating Point
        //2^-149 <= float <= (2-2^-23) * 2^127
        float fooFloat =234.5f;
        // f or F is used to denote that this variable value is of type float;
        // otherwise it is treated as double.

        // Double - Duble-Precision 64-bit IEEE 754 Floating Point
        // 2^-1074 <= x <= (2-2^-52) * 2^1023
        double fooDouble = 123.4;

        // Boolean - true & false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - A single 16-bit Unicode character
        char fooChar = 'A';

        //final variables can't be reassigned/changed
        final int HOURS_I_WORK_PER_WEEK = 9001;
        //but they can be initialized later.
        final double E;
        E = 2.71828;

        //BigInteger - Immutable arbitrary-precision integers
        //
        // BigInteger is a data type that allows programmers to manipulate
        // integers longer than 64-bits. Integers are stored as an array of
        // bytes and are manipulated using functions built into BigInteger
        //
        // BigInteger can be initialized using an array of bytes or string
        BigInteger fooBigInteger = new BigInteger(fooByteArray);

        // BigDecimal - Immutable, arbitrary-precision signed decimal number
        // unscaled value and a 32-bit integer scale
        //
        // BigDecimal allows the programmer complete control over decimal
        // rounding. It is recommended to use BigDecimal with currency values
        // and where exact decimal precision is required.
        //
        // BigDecimal can be initialized with an int,long, double or String
        // or by initializing the unscaled value (BigInteger) and scale (int).
        BigDecimal fooBigDecimal = new BigDecimal(fooBigInteger, fooInt);

        // Be wary of the constructor that takes a float or double as
        // the inaccuracy of the float/double will be copied in BigDecimal.
        // prefer the string constructor when you need an exact value
        BigDecimal tenCents = new BigDecimal("0.1");

        // Strings
        String fooString = "Pyrax Technology ";

        // \n is an escaped character that starts a new line
        String barString = "is an IT company focusing on Linux systems\nand Enterprise server Operating Systems";
        // \t is an escaped character that adds a tab character
        String bazString = "We help you\tInstall\tmanage\tPartition your Enterprise server operating systems";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        // String Building
        // #1 - with plus operator
        // That's the basic way to do it (optimized under the hood)
        String plusConcatenated = "Strings can " + "be concatenated " + "via + operator.";
        System.out.println(plusConcatenated);
        // Output: Strings can be concatenated via + operator.

        // #2 - with a StringBuilder
        // This way doesn't create any intermediate strings. It just stores the string pieces, and ties them together
        // when toString() is called.
        // Hint: This class is not thread safe. A thread-safe alternative (with some impact on performance) is StringBuffer.
        StringBuilder builderConcatenated = new StringBuilder();
        builderConcatenated.append("You ");
        builderConcatenated.append("can use ");
        builderConcatenated.append("The StringBuilder class.");
        System.out.println(builderConcatenated.toString()); // Only now is the String built

        // Output: You can use StringBuilder class.

        // StringBuilder is efficient when the fully constructed String is not required until the end of some processing
        StringBuilder stringBuilder = new StringBuilder();
        String inefficientString = "";
        for (int i = 0; i < 10; i++){
            stringBuilder.append(i).append(" ");
            inefficientString += i + " ";
        }
        System.out.println(inefficientString);
        System.out.println(stringBuilder.toString());
        //inefficientString requires a lot more work to produce, as it generates a String on every loop iteration.
        // Simple concatenation with + is compiled to a StringBuilder and toString()
        //Avoid string concatenation in loops.

        // #3 - With String formatter
        // Another alternative way to create strings. Fast and Readable.
        String.format("%s may prefer %s.", "Or you","String.format()");
        // Output: Or you may prefer String.format().

        //Arrays
        // The array size must be decided upon instantiation
        // The following formats work for declaring an array
        // <datatype>[] <var name> = new <datatype>[<array size>];
        // <datatype> <var name>[] = new <datatype>[<array size>];
        int[] intArray = new int[10];
        String[] stringArray = new String[1];
        boolean boolArray[] = new boolean[100];

        // Another way to declare & initialize an array
        int[] y = {900, 1000, 1300};
        String names[] = {"Joseph", "Ngugi", "Muiruri", "Joseph Muiruri"};
        boolean bools[] = {true, false, false};

        // Indexing an array - accessing an element
        System.out.println("intArray @ 0: " + intArray[0]);

        //Arrays are Zero-indexed and mutable.
        intArray[1] = 1;
        System.out.println("intArray @ 1: " +intArray[1]); // =>1

        // Other data types worth checking out
        // ArrayLists - like arrays except more functionality is offered, and the size is mutable.

        // LinkedLists - Implementation of doubly-linked list. All of the  operations perform as could be expected for
        //                 a doubly-linked list
        // Maps - A mapping of key Objects to value Objects. Map is an interface and therefore cannot be instantiated.
        //        The type of keys and values contained in a map must be specified upon instantiation of the implementing class
        //        Each key may map to only one corresponding value, and each key may appear only once (no duplicates).
        // HashMaps - This class uses a hashtable to implement the map interface. This allows the execution time of basic operations,
        //           such as get and insert element, to remain constant-amortized even for large sets.
        // TreeMap - A map that is sorted by its keys. Each modification maintains the sorting defined by either a comparator
        //           supplied at instantiation, or comparison of each Object if they implement the comparable interface.
        //           Failure of keys to implement comparable combined with failure to supply a comparator will throw a
        //           ClassCastExceptions. Insertion and removal operations take O(log(n)) time so avoid using this data structure
        //           unless you are taking advantage of the sorting.

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Operations
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n->Operators");

        int i1 = 1, i2 = 2; // shorthand for multiple declarations

        // Arithmetic is a straightforward
        System.out.println("1+2 = " + (i1 + i2)); // => 3
        System.out.println("2-1 = " + (i2 - i1)); // => 1
        System.out.println("2*1 = " + (i2*i1)); // => 2
        System.out.println("1/2 = " + (i1/i2)); // => 0 (int/int returns int)
        System.out.println("1/2.0 = " + (i1/(double) i2)); // =>0.5

        //Modulo
        System.out.println("11%3 = " + (11 % 3)); // => 2

        // Comparison Operators
        System.out.println(" 3 == 2? " +(3 == 2)); // => false
        System.out.println(" 3 != 2? " +(3 != 2)); // => true
        System.out.println(" 3 > 2? " +( 3 > 2)); // => true
        System.out.println(" 3 < 2? " +( 3 < 2)); // => false
        System.out.println(" 2 <= 2? " +( 2 <= 2)); // => true
        System.out.println(" 2 >= 2? " +( 2 >= 2)); // => true
        
    }
}
