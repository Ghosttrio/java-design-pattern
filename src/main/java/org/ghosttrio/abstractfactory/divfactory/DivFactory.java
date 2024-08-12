package org.ghosttrio.abstractfactory.divfactory;


import org.ghosttrio.abstractfactory.factory.Factory;
import org.ghosttrio.abstractfactory.factory.Link;
import org.ghosttrio.abstractfactory.factory.Page;
import org.ghosttrio.abstractfactory.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
