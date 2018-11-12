package com.steer.design.iterator;

/**
 * 一、迭代器模式
 */
public class Main {
    /**
     * 遍历时并没有调用BookShelf的方法
     * 当更换容器去管理图书时，比如用List,Vector等，不对while循环做任何更改，代码都可以正常工作
     * @param args
     */
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the world in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-legs"));
        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
