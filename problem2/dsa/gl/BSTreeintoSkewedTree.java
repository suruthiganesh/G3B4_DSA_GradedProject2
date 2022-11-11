package problem2.dsa.gl;

 class BSTree
{
	 int value;
	 BSTree left, right;
	
	 BSTree(int item)
	    {
	        value = item;
	        left = right = null;
	    }

}
public class BSTreeintoSkewedTree 
{
	 BSTree node;
     BSTree prevNode = null;
     BSTree headNode = null;
 
     void ToSkewed(BSTree root, int order)
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
        void traverseRightSkewed(BSTree root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewed(root.right);       
    }
}


