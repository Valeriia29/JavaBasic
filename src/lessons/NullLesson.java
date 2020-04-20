package lessons;

import Animal.Tiger;

public class NullLesson {
    public static void startLessonExample()
    {
    Tiger[] tigerArray;
    tigerArray=new Tiger[]{new Tiger(),new Tiger(),null, new Tiger()};

    for(int i=0; i<tigerArray.length;i++)
{
    Tiger currentTiger=tigerArray[i];
    System.out.println(currentTiger);
    if (currentTiger != null)
    {
        currentTiger.name = "степан"+i;
        System.out.println(currentTiger.name);
    }

}
    for(int i = 0; i < tigerArray.length;i++)
    {
        Tiger currentTiger = tigerArray[i];
        if (currentTiger == null)
        {
            System.out.println("tiger is null");
        }
        else
        {
            System.out.println(currentTiger.name);
        }
    }

//        Tiger tiger1=new Tiger();
//        Tiger tiger2;
//        tiger2 = null;

//        tiger2.getCurrentCounter();
//
//        System.out.println("tiger 1 = "+ tiger1.name);
//        System.out.println("tiger 2 = "+ tiger2.name);
//        System.out.println("null = "+ null);
//        System.out.println(tiger1.name);
//        System.out.println(tiger2.name);


    }

}
