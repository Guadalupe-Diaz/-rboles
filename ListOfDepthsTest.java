public static void main(String[] args) {
    ListOfDepths listOfDepths = new ListOfDepths();

    // Creación del árbol binario
    Node root = new Node(4);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(9);

    // Obtener la lista de profundidades
    List<LinkedList<Node>> result = listOfDepths.listOfDepths(root);

    // Salida en consola para comprobar los valores
    System.out.println("Nivel 0: " + result.get(0).get(0).value); // Esperado: 4
    System.out.println("Nivel 1: " + result.get(1).get(0).value + ", " + result.get(1).get(1).value); // Esperado: 2, 7
    System.out.println("Nivel 2: " + result.get(2).get(0).value + ", " +
            result.get(2).get(1).value + ", " +
            result.get(2).get(2).value + ", " +
            result.get(2).get(3).value); // Esperado: 1, 3, 6, 9
}
