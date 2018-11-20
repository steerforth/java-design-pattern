package com.steer.design.decorator;

public abstract class Border extends Display{
    protected Display display;//被装饰物
    protected Border(Display display){
        this.display = display;
    }
}
