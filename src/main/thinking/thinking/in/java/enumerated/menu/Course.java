//: enumerated/menu/Course.java
package thinking.in.java.enumerated.menu;

import thinking.in.net.mindview.util.*;

public enum Course {
    APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(Food.Dessert.class), COFFEE(
            Food.Coffee.class);
    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
} // /:~
