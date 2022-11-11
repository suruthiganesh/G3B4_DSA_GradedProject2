package problem2.dsa.gl;

public class BSTreeintoSkewedTree 
{
	public static BSTree node;
    static BSTree prevNode = null;
    static BSTree headNode = null;
 
    static void ToSkewed(BSTree root, int order)
    {
        if(root == null)
        {
            return;
        }
              if(order > 0)
        {
            ToSkewed(root.right, order);
        }
        else
        {
            ToSkewed(root.left, order);
        }
              BSTree rightNode = root.right;
              BSTree leftNode = root.left;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
         if (order > 0)
        {
            ToSkewed(leftNode, order);
        }
        else
        {
            ToSkewed(rightNode, order);
        }
    }
       static void traverseRightSkewed(BSTree root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewed(root.right);       
    }
   
    
    public static void main(String[] args)
    {
    	int order = 0;
    	BSTreeintoSkewedTree tree = new BSTreeintoSkewedTree();
        tree.node = new BSTree(50);
        tree.node.left = new BSTree(30);
        tree.node.right = new BSTree(60);
        tree.node.left.left = new BSTree(10);
        tree.node.right.left = new BSTree(55);
          
        ToSkewed(node, order);
        traverseRightSkewed(headNode);
    }
}


