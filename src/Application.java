/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree = new Tree();//Creates a tree with root
		Node root = aTree.generatePracticeTree(5);
		
		System.out.println();
		
		//Instantiate a DepthFirstSearch object and pass the root node
		DepthFirstSearch search = new DepthFirstSearch(root);
		
		//Run a preorder depth-first-search
		search.performDFS();
	}

}