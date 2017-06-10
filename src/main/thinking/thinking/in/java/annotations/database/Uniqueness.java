//: annotations/database/Uniqueness.java
// Sample of nested annotations
package thinking.in.java.annotations.database;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
} // /:~