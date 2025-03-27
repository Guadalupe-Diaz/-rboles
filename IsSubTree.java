/*
 * Determina si el árbol second es subárbol del árbol first.
 * 
 * Ejemplo 1:
 *   Input:
 *     first:
 *        4
 *     5     7
 *   1    3
 * 8
 * 
 * 4 - 5 - 1 - 8 - X - X - x - 3 - X - X - 7 - X - X
 * 
 * 5 - 1 - 8 - X - X - X - X
 *     second:
 *        5
 *    1     
 * 8
 *   Output: true
 */
public class IsSubTree {
    public boolean isSubtree(Node first, Node second){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        preOrder(first, sb1);
        preOrder(second, sb2);
        return sb1.toString().contains(sb2.toString());
    }

    private void preOrder(Node node, StringBuilder sb){
        if(node == null){
            sb.append("X");
            return;
        }
        sb.append(node.value);
        preOrder(node. left, sb);
        preOrder(node. right, sb);
    }
}
