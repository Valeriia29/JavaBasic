package lessons.object;

import java.util.Arrays;

public class city {
    private String name;

    private Street[] streetArray;


    public city(String name, Street[] streetArray) {
        this.name = name;
        this.streetArray = streetArray;
    }

    @Override
    public String toString() {
        return "city{" +
                "name='" + name + '\'' +
                ", streetArray=" + Arrays.toString(streetArray) +
                '}';
    }
}
