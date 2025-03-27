public static void main(String[] args) {
    FirstCommonAncestor fca = new FirstCommonAncestor();
    
    // Creación del árbol binario
    Node root = new Node(4);
    root.left = new Node(5);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.left.left.left = new Node(8);
    
    // Pruebas con salida en consola
    System.out.println("Resultado 1: " +
        fca.firstCommonAnsestor(root, root.left.left.left, root.right).value);
    System.out.println("Resultado 2: " +
        fca.firstCommonAnsestor(root, root.left.left, root.left.right).value);
    System.out.println("Resultado 3: " +
        (fca.firstCommonAnsestor(root, root, root.right) == null ? "null" : 
        fca.firstCommonAnsestor(root, root, root.right).value));
}