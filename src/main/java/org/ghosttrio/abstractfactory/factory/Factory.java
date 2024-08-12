package org.ghosttrio.abstractfactory.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            // Class 클래스의 forName 메서드를 사용하여 해당 클래스를 동적으로 가져온다.
            // getDeclaredConstructor로 생성자를 얻고 newInstance 메서드로 인스턴스로 만든다.
            // 리플랙션
            factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(classname + " 클래스가 발견되지 않았습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
