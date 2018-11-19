package com.steer.design.composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    /**
     * 只允许Directory可以add,通过重写方法
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry)throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
