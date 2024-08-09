package org.ghosttrio.templatemethod;

import java.util.function.Consumer;

public class LambdaDisplay {

    public final void display2(FunctionalTest open, FunctionalTest print, FunctionalTest close) {
        open.execute();
        for (int i=0; i<5; i++) {
            print.execute();
        }
        close.execute();
    }
}
