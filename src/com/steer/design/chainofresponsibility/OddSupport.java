package com.steer.design.chainofresponsibility;

/**
 * 只解决奇数编号
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() %2 == 1){
            return true;
        }
        return false;
    }
}
