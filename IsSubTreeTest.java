public static void main(String[] args) {
    IsSubTree isSubTree = new IsSubTree();

    // Creación del primer árbol
    Node first = new Node(4);
    first.left = new Node(5);
    first.right = new Node(7);
    first.left.left = new Node(1);
    first.left.right = new Node(3);
    first.left.left.left = new Node(8);

    // Creación del segundo árbol
    Node second = new Node(5);
    second.left = new Node(1);
    second.right = new Node(3);
    second.left.left = new Node(8);

    // Prueba 1: Comprobar si `second` es un subárbol de `first`
    System.out.println("Prueba 1: " + isSubTree.isSubtree(first, second)); // Esperado: true

    // Modificar `second` para la Prueba 2
    second.right.right = new Node(12);

    // Prueba 2: Comprobar si `second` sigue siendo un subárbol de `first`
    System.out.println("Prueba 2: " + isSubTree.isSubtree(first, second)); // Esperado: false
}
