package org.ghosttrio.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));
        bookShelf.appendBook(new Book("4"));

        // 명시적으로 Iterator를 사용하는 방법
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

    }
}
