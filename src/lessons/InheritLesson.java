package lessons;

import Animal.Animal;
import Animal.Sheep;
import lessons.object.Street;
import lessons.object.city;

public class InheritLesson {
    public static void startLessonExample()
{
//    Street street1= new Street("кольцовская");
//    Street street2 = new Street("кирова");
//
//    Street[] array = new Street[]{street1,street2};
//
//    city VRN = new city("VRN",array);
//    System.out.println(VRN);
//
    Sheep sheep = new Sheep();
    sheep.drink();
    sheep.eat();
    sheep.run();
Animal animal = new Sheep();
animal.eat();
animal.drink();
animal.run();


}
}
