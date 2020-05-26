package HW.Hash_Equals_2020_05_22;

import java.util.Objects;

public class Hamster {

    public String name = "default name";

    private int weight = 0;
    public Hamster(String name, int weight)
    {
        this.name=name;
        this.weight=weight;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamster hamster = (Hamster) o;
        return weight == hamster.weight &&
                Objects.equals(name, hamster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}


