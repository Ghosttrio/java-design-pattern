package org.ghosttrio.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("싱글톤 인스턴스를 생성한다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
