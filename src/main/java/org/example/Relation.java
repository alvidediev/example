package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Relation {
    HUSBAND("Отец"), WIFE("Жена"), SON("Сын"), DAUGHTER("Дочь");

    public final String relation;
}
