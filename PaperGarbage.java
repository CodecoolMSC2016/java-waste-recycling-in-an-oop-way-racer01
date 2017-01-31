public class PaperGarbage extends Garbage
{
    protected boolean _isSqueezed;
    public PaperGarbage(String garbageName, boolean isSqueezed)
    {
        super(garbageName);
        this._isSqueezed = isSqueezed;
    }

    public boolean isSqueezed()
    {
        return this._isSqueezed;
    }

    public void squeeze()
    {
        this._isSqueezed = true;
    }
}
