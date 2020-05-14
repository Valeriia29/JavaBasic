package lessons.object.transport;

public class Plane implements EngineVihicle,SaleObject,MoveObject
{

    private boolean isEnableLeftPlaneEngine=false;
    private boolean isEnableRightPlaneEngine=false;

    private int price = 10000000;
    private int workHours=0;

    private int distance=0;

    public Plane(){

    }


    @Override
    public void start() {
        isEnableLeftPlaneEngine=true;
        isEnableRightPlaneEngine=true;
        workHours=workHours+2;
    }

    @Override
    public void stop() {
        isEnableLeftPlaneEngine=false;
        isEnableRightPlaneEngine=false;


    }

    @Override
    public void setSpeed() {

    }

    @Override
    public boolean isOn()
    {


        return isEnableLeftPlaneEngine&&isEnableRightPlaneEngine;

    }

    @Override
    public int getCurrentPrice() {
        return price-workHours*100;
    }

    @Override
    public void move(int newDistance) {
        distance=distance+newDistance;

    }

    @Override
    public int getDistance() {
        return distance;
    }
}
