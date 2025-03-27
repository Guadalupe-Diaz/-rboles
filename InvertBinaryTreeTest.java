public static void main(String[] args) {
    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(9);

    Node newRoot = invertBinaryTree.invertTree(root);

    // Salida en consola
    System.out.println("Root Value: " + newRoot.value); // Esperado: 4
    System.out.println("Left Child: " + newRoot.left.value); // Esperado: 7
    System.out.println("Right Child: " + newRoot.right.value); // Esperado: 2
    System.out.println("Left-Left Child: " + newRoot.left.left.value); // Esperado: 9
    System.out.println("Left-Right Child: " + newRoot.left.right.value); // Esperado: 6
    System.out.println("Right-Left Child: " + newRoot.right.left.value); // Esperado: 3
    System.out.println("Right-Right Child: " + newRoot.right.right.value); // Esperado: 1
}