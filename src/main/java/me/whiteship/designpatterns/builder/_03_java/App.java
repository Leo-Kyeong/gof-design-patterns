package me.whiteship.designpatterns.builder._03_java;

public class App {
    public static void main(String[] args) {
        LombokExample lombok = LombokExample.builder().title("title").days(3).nights(2).build();
    }
}
