package org.ghosttrio.templatemethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello world");
        d1.display();
        System.out.println();
        d2.display();

        LambdaDisplay lambdaDisplay = new LambdaDisplay();
        lambdaDisplay.display2(
                () -> System.out.println("Test"),
                () -> System.out.println("test2"),
                () -> System.out.println("test3"));
    }
}
