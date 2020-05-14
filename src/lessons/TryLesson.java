package lessons;

import Animal.Animal;
import Animal.Sheep;
import Animal.Tiger;

public class TryLesson {
    public static void startLessonExample(){

        Animal[] animals = new Animal[] {
                new Tiger(),
                new Sheep(),
                new Sheep("newsh")};
       // System.out.println(countAnimal(animals));
        speakWithAnimal(animals);


}
    private static int countAnimal(Animal[] animals){
        int result = 0;
        for (int i=0;i<animals.length;i++){
            result = result + 1;
        }
        return result;
}
    private static void speakWithAnimal (Animal[] animals){
        for (int i=0;i<animals.length;i++){

        try{
        Animal animal=animals[i];
        Sheep sheep = (Sheep) animal;
            sheep.doIt();


            int a=100/0;
        } catch (ClassCastException e){
            System.out.println("all down");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("na 0 delit` nel`zya");
        }finally {
            System.out.println("finally");
        }


//            if (animal instanceof Sheep){
//                System.out.println("Hi Sheep!");
//
//
//
//            }
////            if (animal.getClass() == Sheep.class){
////                System.out.println("Hi Sheep 1 test!");
////            }
//            if (animal instanceof Tiger){
//                System.out.println("Hi Tiger!");
//            }
//            if (animal instanceof Animal){
//                System.out.println("animal");
//            }
//            if (animal instanceof Object){
//                System.out.println("OBJ");
//            }
//
//        }

}
//    private static void cutSheep(Sheep[] sheepArray){
//        for (int i=0;i<sheepArray.length;i++){
//            System.out.println(sheepArray[i]);
//        }
//
// }
}}