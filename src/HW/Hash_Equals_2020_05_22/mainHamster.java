package HW.Hash_Equals_2020_05_22;

public class mainHamster {
    public static void startLessonExample()
    {
        Hamster hamster = new Hamster("First",21356);
        Hamster hamster1 = new Hamster("Second",56);
        Hamster hamster2 = new Hamster("",2);
        Hamster hamster3 = new Hamster("First",21356);

        System.out.println(hamster.equals(hamster1));
        System.out.println(hamster2.equals(hamster));
        System.out.println(hamster3.equals(hamster));
    }


}
