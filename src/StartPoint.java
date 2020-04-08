import Animal.Tiger;
import Animal.Tiger2;

public class StartPoint {
    public static void main(String[] args) {
        System.out.println("current tiger counter - " + Tiger.tigerCounter);

        Tiger tiger= new Tiger();
        System.out.println("current tiger counter - " + Tiger.tigerCounter);
        System.out.println(" tiger counter:" + tiger.getCurrentCounter());
        System.out.println("tiger name=" + tiger.name);
        tiger.addOneMore();
        tiger.name="Ben";
        System.out.println(" tiger counter:" + tiger.getCurrentCounter());
        System.out.println("tiger name=" + tiger.name);


        Tiger anotherTiger=new Tiger();
        System.out.println("current tiger counter - " + Tiger.tigerCounter);
        System.out.println("Another tiger counter:" + anotherTiger.getCurrentCounter());
        System.out.println("another tiger name="+anotherTiger.name);

        new Tiger();
        new Tiger();
        System.out.println("current tiger counter - " + Tiger.tigerCounter);


    }
}
