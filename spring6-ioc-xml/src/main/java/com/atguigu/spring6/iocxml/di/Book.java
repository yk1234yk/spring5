package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    private String others;

    public void setOthers(String others) {
        this.others = others;
    }

    //    生成set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public Book() {
        System.out.println("无参数构造执行了...");
    }

    public Book(String bname, String author) {
        System.out.println("有参数构造执行了...");
        this.bname = bname;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("心海");
        book.setAuthor("珊瑚宫");

        //通过构造器注入
        Book book1 = new Book("宵宫", "稻妻");
    }
}
