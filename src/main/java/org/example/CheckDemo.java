package org.example;

import java.util.Objects;

public final class CheckDemo {

    CheckDemo checkDemo;

    private CheckDemo() {
    }

    public synchronized CheckDemo getInstance() {
        if (Objects.isNull(checkDemo)) {
            checkDemo = new CheckDemo();
        }
        return checkDemo;
    }

//Employee - Department
    //emp1 dept1
    //emp2 dept2
    //emp1 dept2
}
