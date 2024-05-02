
public class Beispiel
{
    Binaerbaum<Integer> tree;

    public Beispiel()
    {
        tree = new Binaerbaum(121, new Binaerbaum(11, null, new Binaerbaum(87)), new Binaerbaum(65, new Binaerbaum(45), new Binaerbaum(1)));
    }
    
    public int getLength()
    {
        return tree == null ? 0 : getLength(tree.links) + getLength(tree.rechts) + 1;
    }
    
    private int getLength(Binaerbaum tree)
    {
        return tree == null ? 0 : getLength(tree.links) + getLength(tree.rechts) + 1;
    }
    
    public int getDepth()
    {
        return tree == null ? 0 : (getDepth(tree.links) < getDepth(tree.rechts)) ? getDepth(tree.rechts) + 1 : getDepth(tree.links) + 1;
    }
    
    private int getDepth(Binaerbaum tree)
    {
        return tree == null ? 0 : (getDepth(tree.links) < getDepth(tree.rechts)) ? getDepth(tree.rechts) + 1 : getDepth(tree.links) + 1;
    }
    
    public boolean contains(int element)
    {
        return tree == null ? false : ((int) tree.daten == element) ? true : (contains(element, tree.rechts) || contains (element, tree.links));
    }
    
    private boolean contains(int element, Binaerbaum tree) {
        return tree == null ? false : ((int) tree.daten == element) ? true : (contains(element, tree.rechts) || contains (element, tree.links));
    }
    
    public int sum()
    {
        return tree == null ? 0 : (int) tree.daten + sum(tree.links) + sum(tree.rechts);
    }
    
    private int sum(Binaerbaum tree)
    {
        return tree == null ? 0 : (int) tree.daten + sum(tree.links) + sum(tree.rechts);
    }
}
