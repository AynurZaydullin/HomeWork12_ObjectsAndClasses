package pro.sky.java.course1.HomeWork13MethodsOfObjects;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Автор = " + name + " " + lastName + '\n';
    }

}