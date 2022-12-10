package me.whiteship.designpatterns.builder;

import lombok.Builder;

@Builder
public class LombokExample {
    private String title;
    private int nights;
    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();

        LombokExample walk = LombokExample.builder()
                .title("산책")
                .days(1)
                .build();
    }
}
