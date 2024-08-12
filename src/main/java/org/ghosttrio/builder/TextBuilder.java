package org.ghosttrio.builder;

public class TextBuilder extends Builder {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("txtTitle");
    }

    @Override
    public void makeString(String str) {
        sb.append("txtString");
    }

    @Override
    public void makeItems(String[] items) {
        for (String i : items) {
            sb.append(i);
        }
    }

    @Override
    public void close() {
        sb.append("close");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
