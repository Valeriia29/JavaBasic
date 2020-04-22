package lessons.object;

public class Street {
    private String name;
    public Street(String streetName){
        this.name=streetName;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }
}
