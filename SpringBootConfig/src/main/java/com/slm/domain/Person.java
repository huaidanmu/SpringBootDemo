package com.slm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
@Setter@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private String sex;
    private String[] hobby;
}
