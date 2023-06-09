package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Family {
    private final Men husband;
    private final Women wife;
    private final List<Children> children;
}
