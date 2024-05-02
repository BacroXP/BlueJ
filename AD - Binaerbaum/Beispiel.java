
public class Beispiel
{
    Binaerbaum<Integer> tree;

    public Beispiel()
    {
        tree = new Binaerbaum(121, new Binaerbaum(11, null, new Binaerbaum(87)), new Binaerbaum(65, new Binaerbaum(45), new Binaerbaum(1)));
    }
    
    public int getLength()
    {
        return tree.getNElements();
    }
    
    public int getDepth()
    {
        return tree.getDepth();
    }
    
    public boolean contains(int element)
    {
        return tree.contains(element);
    }
}
