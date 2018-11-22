package com.steer.design.visitor;

public interface Element {
    public abstract void accept(Visitor visitor);
}
