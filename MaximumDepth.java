/*
 * Dada la raíz de un árbol binario, devuelve su profundidad máxima.
 * 
 * Ejemplo:
 *  Input:
 *       4
 *    2     7
 *  1   3
 * 8
 *  Output: 4
 */
public class MaximumDepth {
    
    public int maxDepth(Node root){
        if (root == null) return 0;

        int depthLeft = maxDepth(root.left) + 1;
        int depthRight = maxDepth(root.right) + 1;

        return Math.max(depthLeft, depthRight);
    }
}
