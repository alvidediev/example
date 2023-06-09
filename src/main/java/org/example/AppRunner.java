package org.example;

import java.util.List;

import static org.example.Relation.*;

public class AppRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addToTree(new Family(
                Men.builder()
                        .firstName("Alexander")
                        .lastName("Levin")
                        .age(44)
                        .relation(HUSBAND)
                        .build(),
                Women.builder()
                        .firstName("Alexandra")
                        .lastName("Levina")
                        .age(41)
                        .relation(WIFE)
                        .build(),
                List.of(
                        Children.builder()
                                .firstName("Sasha")
                                .lastName("Levina")
                                .age(15)
                                .relation(DAUGHTER)
                        .build(),
                        Children.builder()
                                .firstName("Leon")
                                .lastName("Levin")
                                .age(14)
                                .relation(SON)
                                .build())
        ));
        System.out.println(tree.findFamilyByNameAndLastName("Sasha", "Levina"));
        System.out.println(tree.getAll());
    }
}
