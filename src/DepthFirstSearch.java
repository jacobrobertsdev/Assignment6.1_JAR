public class DepthFirstSearch {

    private Node root;
    private int nodeCount; 
    
    /**
     * Constructor
     * 
     * @param root the root node to set
     */
    public DepthFirstSearch(Node root) {               
        this.root = root;
        this.nodeCount = 0;
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }
    
    /**
     * Performs a preorder depth-first-search using the helper method DFS.
     * Prints the number of nodes traversed and the height of the tree.
     * 
     */
    public void performDFS() {
        DFS(root);
        System.out.println("Total nodes traversed: " + nodeCount);
        int height = calculateHeight(root);
        System.out.println("Height of the tree: " + height);
    }
    
    /**
     * Helper method for performDFS. Recursively traverses and visits nodes in the tree.
     * Prints the node data (visits), and increments nodeCount.
     * 
     * @param node the root node to use as the entry point
     */
    private void DFS(Node node) {     
        if (node != null) {
            nodeCount++;
            System.out.println(node.getData()); 
            DFS(node.getlChild());
            DFS(node.getrChild());
        }
    }
    
    /**
     * Calculates the height of the tree using recursion.
     * 
     * @param node the node to use as the entry point
     * @return the height of the tree as an integer
     */
    private int calculateHeight(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = calculateHeight(node.getlChild());
        int rightHeight = calculateHeight(node.getrChild());
        return Math.max(leftHeight, rightHeight) + 1; // Will return 0 when a leaf is reached (-1 + 1)
    }
}