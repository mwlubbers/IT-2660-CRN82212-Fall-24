class Main {
  public static void main(String[] args) {

    // Step 1 - Create a BST tree object called lab5Tree
  BST<Integer> Lab5Tree = new BST<Integer>();
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
  Lab5Tree.insert(13);
  Lab5Tree.insert(22);
  Lab5Tree.insert(36);
  Lab5Tree.insert(5);
  Lab5Tree.insert(48);
  Lab5Tree.insert(17);
  Lab5Tree.insert(39);
  Lab5Tree.insert(2);
  Lab5Tree.insert(26);
  Lab5Tree.insert(40);
  Lab5Tree.insert(29);
  Lab5Tree.insert(34);
  Lab5Tree.insert(10);

    // Step 3 - Delete the value 17
  Lab5Tree.delete(17);
    // Step 4 - Traverse and output the values using inorder (sorted)
  System.out.println("Inorder");
    Lab5Tree.inorder();
    System.out.println("");
    // Step 5 - Traverse and output the values using postorder
  System.out.println("Postorder");
    Lab5Tree.postorder();
    System.out.println("");
    // Step 6 - Traverse and output the values using preorder
  System.out.println("Preorder");
    Lab5Tree.preorder();
    System.out.println("");
    // Step 7 - Display the result of a search for the value 36
    System.out.println("Search for 36");
    boolean find = Lab5Tree.search(36);
    System.out.println(find);
    // Step 8 - Display the result of a search for the value 37
  System.out.println("Search for 37");
   find = Lab5Tree.search(37);
   System.out.println(find);
  // Step 9 - Using the path() method, display the path from the root to 2
  System.out.println("Path from root to 2");
  var path = Lab5Tree.path(2);
  for (BST.TreeNode<Integer> node : path) {
    System.out.println(node.element);
    
  }
    // Step 10 - Display the path from the root to 34
    System.out.println("Path from root to 34");
    path = Lab5Tree.path(34);
  for (BST.TreeNode<Integer> node : path) {
    System.out.println(node.element);
  }
}}