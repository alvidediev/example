package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Tree {

    private List<Family> familyTree = new ArrayList<>();

    public void addToTree(Family family) {
        familyTree.add(family);
    }

    public Family findFamilyByNameAndLastName(String firstName, String lastName) {
            for (Family family : familyTree) {
                if (family.getHusband().getFirstName().equals(firstName)
                        && family.getHusband().getLastName().equals(lastName)) {
                    return family;
                }else if (family.getWife().getFirstName().equals(firstName)
                        && family.getWife().getLastName().equals(lastName)) {
                    return family;
                }
            }

    return null;
    }

    public List<Family> getAll(){
        return familyTree;
    }
}
