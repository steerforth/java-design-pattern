package com.steer.design.chainofresponsibility;

/**
 * 永远不解决
 */
public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
