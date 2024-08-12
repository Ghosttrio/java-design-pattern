package org.ghosttrio.prototype;

public interface Product extends Cloneable {
    void use(String s);
    Product createCopy();
}