//: polymorphism/shape/Square.java
package thinking.in.java.polymorphism.shape;

import static thinking.in.net.mindview.util.Print.*;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
} // /:~