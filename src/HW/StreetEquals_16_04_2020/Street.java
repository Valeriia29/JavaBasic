package HW.StreetEquals_16_04_2020;

import java.util.Objects;

public class Street {

    String name;
    String description;
    String key;


public Street(String newName){
    this.name = newName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(name, street.name) &&
                Objects.equals(description, street.description) &&
                Objects.equals(key, street.key);
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
