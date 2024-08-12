package org.ghosttrio.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("greeting");
        builder.makeString("인사");
        builder.makeItems(new String[]{
                "test1",
                "test2",
                "test3",
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
                "test11",
                "test22",
                "test33",
        });
        builder.close();
    }
}
