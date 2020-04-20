package HW.StreetEquals_16_04_2020;

public class StreetEqual {
    public static void StartStreetEqual() {

        Street street = new Street("VRN");
        Street street1 = new Street("MSC");
        Street street2 = new Street("SPB");
        Street street3 = new Street("VRN");
        Street street4 = new Street("NY");
        Street street5 = new Street("VRN");
        Street street6 = new Street("MSC");
        Street[] ArrStreet=new Street[7];
        ArrStreet[0]=street;
        ArrStreet[1]=new Street("MSC");
        ArrStreet[2]=street1;
        ArrStreet[3]=street2;
        ArrStreet[4]=street3;
        ArrStreet[5]=street4;
        ArrStreet[6]=street5;

        int result=checkStreetCopiesCount(ArrStreet,new Street("SPB"));

        System.out.println(result);
    }

    public static int checkStreetCopiesCount(Street[] array, Street street){
        int count=0;
        for (int i=0;i<array.length;i++){
            if(street.equals(array[i])){
                count=count+1;
            }
        }
        return count;
    }
}
