package org.concepts.imports.example;

import static java.time.Month.APRIL;
import static java.time.Month.MAY;
import static java.util.Arrays.asList;

import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * - Static import 
 * It is to import single static member or all static members of a class
 * It can use wildcard to import all static members or specific static member's name
 * It doesn't accept class name ending without any wildcard, else does not compile
 *
 * Useful when using a lot of constants in another class.
 * But over-using it in large program makes difficult to recognize from where every static member comes
 */
public class StaticImport {
    public static void main(String[] args) {
        List<String> list1 = asList("one", "two");
        List<String> list2 = Arrays.asList("one", "two");

        System.out.println(APRIL);			// because import static java.time.Month.APRIL;
        System.out.println(MAY);			// because import static java.time.Month.*;
        System.out.println(Month.AUGUST);	// because import static java.time.Month;
    }
}
