public class PlasticGarbage extends Garbage
{
    protected boolean _isClean;
    public PlasticGarbage(String garbageName, boolean isClean)
    {
        super(garbageName);
        this._isClean = isClean;
    }

    public boolean isClean()
    {
        return this._isClean;
    }

    public void clean()
    {
        this._isClean = true;
    }
}
