package HW.ArrayList_07_05_2020;

import Animal.Sheep;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void startLessonExample()
{
    ArrayList<Sheep> sheepArrayList = new ArrayList();
    sheepArrayList.add(new Sheep("1"));
    sheepArrayList.add(new Sheep("2"));
    sheepArrayList.add(new Sheep("3"));
    sheepArrayList.add(new Sheep("4"));
    sheepArrayList.add(new Sheep("5"));
    sheepArrayList.add(new Sheep("6"));
    sheepArrayList.add(new Sheep("7"));
    sheepArrayList.add(new Sheep("8"));
    sheepArrayList.add(new Sheep("9"));
    sheepArrayList.add(new Sheep("10"));


    ArrayList<Sheep> sheepArrayList1 = new ArrayList(sheepArrayList);
    //System.out.println(sheepArrayList1);
    sheepArrayList1.add(new Sheep("101"));
    sheepArrayList1.add(new Sheep("102"));
    sheepArrayList1.add(new Sheep("103"));
    for(Sheep sheep: sheepArrayList1){
//         if (sheepArrayList1.equals(1)){
//           // sheepArrayList1.set(index,"updated");
//        }

         if(sheep.name.contains("1")) {
             sheep.name="updated";
        }

    }
    System.out.println(sheepArrayList1);
}
}
