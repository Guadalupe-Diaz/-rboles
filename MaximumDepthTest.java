public static void main(String[] args) {
    MaximumDepth maxDepth = new MaximumDepth();

    // Creación del árbol binario
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);

    // Prueba 1: Verificar la profundidad máxima
    System.out.println("Profundidad máxima (Prueba 1): " + maxDepth.maxDepth(root)); // Esperado: 3

    // Modificar el árbol para la Prueba 2
    root.left.left.left = new Node(8);

    // Prueba 2: Verificar la profundidad máxima después de la modificación
    System.out.println("Profundidad máxima (Prueba 2): " + maxDepth.maxDepth(root)); // Esperado: 4
}