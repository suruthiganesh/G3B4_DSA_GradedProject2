package problem2.dsa.gl;

public class Driverclass
{
	 public static void main(String[] args)
	    {
	    	int order = 0;
	    	BSTreeintoSkewedTree tree = new BSTreeintoSkewedTree();
	        tree.node = new BSTree(50);
	        tree.node.left = new BSTree(30);
	        tree.node.right = new BSTree(60);
	        tree.node.left.left = new BSTree(10);
	        tree.node.right.left = new BSTree(55);
	          
	        tree.ToSkewed(tree.node, order);
	        tree.traverseRightSkewed(tree.headNode);
	    }
}