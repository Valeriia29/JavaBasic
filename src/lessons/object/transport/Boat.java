package lessons.object.transport;

import lessons.object.transport.EngineVihicle;
import lessons.object.transport.SaleObject;

public class Boat implements EngineVihicle, SaleObject
{
    private boolean isEnableSmallEngine = false;

    @Override
    public void start()
    {
        isEnableSmallEngine = true;

    }

    @Override
    public void stop()
    {
        isEnableSmallEngine = false;
    }

    @Override
    public void setSpeed()
    {

    }

    @Override
    public boolean isOn()
    {
        return isEnableSmallEngine;
    }

    @Override
    public int getCurrentPrice()
    {
        return 100000;
    }
}
