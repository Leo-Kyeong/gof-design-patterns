package me.whiteship.designpatterns.builder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.stream.Stream;

public class SpringJavaBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("keesun").toString();

        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> names = streamBuilder.add("keesun").add("whiteship").build();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-playlist ep1")
                .build().encode();
        System.out.println(uriComponents);
    }
}
