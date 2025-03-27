public class BinaryTreeTraversals {
    public static void inOrderTraversals(Node node){
        if (node != null){
            inOrderTraversals(node.left);
            System.out.print(node.value + " ");
            inOrderTraversals(node.right);
        }
    }

    public static void preOrderTraversal(Node node){
        if(node != null){
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");

        }
    }
}
