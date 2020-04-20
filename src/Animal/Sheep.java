package Animal;

import java.util.Objects;

/**
 * Наследник класса Object. Как и все классы неявно в java.
 */
public class Sheep extends Object {
    private String name = "default name";

    private int countLegs = 4;

    public Sheep() {
        System.out.println("Hi!!");
    }

    public Sheep(String newName, int countLegs) {
        this(newName);
        this.countLegs = countLegs;
    }

    public Sheep(String newName) {
        this();
        name = newName;
    }

    /**
     * Переопределеный метод
     *
     * @return данные об экземпляре класса в удобном для человека виде.
     */
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", countLegs=" + countLegs +
                '}';
    }

//    public boolean equals(final Object o)
//    {
//
//        System.out.println("equals start: current obj = " + this + "; parameter object ==" + o);
//        Sheep oSheep= (Sheep) o;
//        if (this.countLegs == oSheep.countLegs)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }}


    @Override
    public boolean equals(Object o) {
        System.out.println("equals start: current obj = " + this + "; parameter object ==" + o);
        if (this == o) {
            System.out.println("link equals");
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            System.out.println("parameter 0 = " + o);
            return false;
        }
        final Sheep sheep = (Sheep) o;
        System.out.println("59 strings");
        if (this.countLegs == sheep.countLegs && this.name == sheep.name)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}



