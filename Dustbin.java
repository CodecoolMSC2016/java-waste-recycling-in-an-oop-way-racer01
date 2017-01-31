import java.util.ArrayList;


public class Dustbin
{
    protected String _color;
    protected ArrayList<PaperGarbage> _paperContent;
    protected ArrayList<PlasticGarbage> _plasticContent;
    protected ArrayList<Garbage> _houseWasteContent;

    public Dustbin(String color)
    {
        this._color = color;
        this._paperContent = new ArrayList<PaperGarbage>();
        this._plasticContent = new ArrayList<PlasticGarbage>();
        this._houseWasteContent = new ArrayList<Garbage>();
    }

    public void throwOutGarbage(Object garbage) throws DustbinContentException
    {
        if(garbage instanceof Garbage)
        {
            if(garbage instanceof PaperGarbage)
            {
                if(((PaperGarbage)garbage).isSqueezed())
                {
                    this._paperContent.add((PaperGarbage)garbage);
                }
                else
                    throw new DustbinContentException();
            }
            else if(garbage instanceof PlasticGarbage)
            {
                if(((PlasticGarbage)garbage).isClean())
                {
                    this._plasticContent.add((PlasticGarbage)garbage);
                }
                else
                    throw new DustbinContentException();
            }
            else
                this._houseWasteContent.add((Garbage)garbage);
        }
        else
            throw new DustbinContentException();
    }

    public PaperGarbage[] getPaperContent()
    { return this._paperContent.toArray(new PaperGarbage[0]); }

    public PlasticGarbage[] getPlasticContent()
    { return this._plasticContent.toArray(new PlasticGarbage[0]); }

    public Garbage[] getHouseWasteContent()
    { return this._houseWasteContent.toArray(new Garbage[0]); }

    public void emptyContents()
    {
        this._paperContent.clear();
        this._plasticContent.clear();
        this._houseWasteContent.clear();
    }
}
