package lessons;

import Animal.Sheep;
import Animal.Tiger;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class EqualsLesson {
    public static void StartLessonExample()
    {
        Sheep sheep= new Sheep();

        Sheep sheep2=sheep;
        System.out.println(sheep.equals(sheep2));

        System.out.println(sheep.equals(null));

        Tiger tiger= new Tiger();
        System.out.println(sheep.equals(tiger));

        Sheep newSheep = new Sheep();
        System.out.println(sheep.equals(newSheep));

        System.out.println(sheep==newSheep);



    }
}
