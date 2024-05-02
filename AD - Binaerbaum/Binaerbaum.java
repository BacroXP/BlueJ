
public class Binaerbaum<T>
{
    public T daten;
    public Binaerbaum<T> links;
    public Binaerbaum<T> rechts;

    public Binaerbaum(T daten, Binaerbaum<T> links, Binaerbaum<T> rechts)
    {
        this.daten = daten;
        this.links = links;
        this.rechts = rechts;
    }

    public Binaerbaum(T daten)
    {
        this(daten, null, null);
    }

    public boolean istBlatt()
    {
        return links == null && rechts == null;
    }
    
    public int getNElements()
    {
        if (links != null && rechts != null) {
            return links.getNElements() + rechts.getNElements() + 1;
        }
        else if (links != null) {
            return links.getNElements() + 1;
        }
        else if (rechts != null) {
            return rechts.getNElements() + 1;
        }

        return 1;
    }
    
    public int getDepth()
    {
        if (links != null && rechts != null) {
            return (links.getDepth() < rechts.getDepth()) ? rechts.getDepth() + 1 : links.getDepth() + 1;
        } else if (links != null) {
            return links.getDepth() + 1;
        } else if (rechts != null) {
            return rechts.getDepth() + 1;
        }
        else {
            return 1;
        }
    }
    
    public boolean contains(T element)
    {
        boolean c = false;

        if (links != null && rechts != null && c == false) {
            c = links.contains(element) ? true : rechts.contains(element);
        }
        else if (links != null && c == false) {
            c = links.contains(element);
        }
        else if (rechts != null && c == false) {
            c = rechts.contains(element);
        }

        return c ? true : daten == element;
    }
}
