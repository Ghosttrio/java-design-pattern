package org.ghosttrio.visitor;

public interface Element {
    public abstract void accept(Visitor v);
}
