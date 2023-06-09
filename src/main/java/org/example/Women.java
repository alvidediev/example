package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Women {
    private String firstName;
    private String lastName;
    private int age;
    private Relation relation;
}
