package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Children {
    private String firstName;
    private String lastName;
    private int age;
    private Relation relation;
}
