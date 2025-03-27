public static void main(String[] args) {
    ValidateBST validateBST = new ValidateBST();

    // Creación del árbol binario
    Node root = new Node(4);
    root.left = new Node(5);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.left.left.left = new Node(8);

    // Prueba 1: Validar si es un BST
    System.out.println("Es un BST válido (Prueba 1): " + validateBST.isValidBST(root)); // Esperado: false

    // Modificar el árbol para la Prueba 2
    root.left.value = 2;
    root.left.left.left = null;

    // Prueba 2: Validar nuevamente si es un BST
    System.out.println("Es un BST válido (Prueba 2): " + validateBST.isValidBST(root)); // Esperado: true
}