package com.rainbow.blue.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {
    Long id;
    String title;
    String author;
    String publisher;
}
