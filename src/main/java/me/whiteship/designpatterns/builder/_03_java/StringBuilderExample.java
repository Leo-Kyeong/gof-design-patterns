package me.whiteship.designpatterns.builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("Leo").append("Kyeong").toString();
        System.out.println(result);
    }
}
