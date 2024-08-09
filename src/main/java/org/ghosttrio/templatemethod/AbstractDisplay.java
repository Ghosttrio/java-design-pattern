package org.ghosttrio.templatemethod;

import java.util.function.Consumer;

public abstract class AbstractDisplay {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i=0; i<5; i++) {
            print();
        }
        close();
    }


}
