package org.ghosttrio.abstractfactory.listfactory;


import org.ghosttrio.abstractfactory.factory.Factory;
import org.ghosttrio.abstractfactory.factory.Link;
import org.ghosttrio.abstractfactory.factory.Page;
import org.ghosttrio.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
