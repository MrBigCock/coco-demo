//: net/mindview/atunit/Test.java
// The @Test tag.
package thinking.in.java.net.mindview.atunit;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
} // /:~
