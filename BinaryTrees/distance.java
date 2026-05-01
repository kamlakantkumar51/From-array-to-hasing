class distance{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node Lca(Node root,int a,int b){
        if(root == null){
            return null;
        }
        if(root.data == a || root.data == b){
            return root;
        }
        Node leftLca = Lca(root.left,a,b);
        Node rightLca = Lca(root.right,a,b);
        if(leftLca != null && rightLca != null){
            return root;
        }
        if(leftLca != null){
            return leftLca;
        }else{
            return rightLca;
        }

    }
    public static int lcaDist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right,n);

        if(leftDist  == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist +1;
        }else{
            return leftDist +1;
        }
    }
    public static int minDistance(Node root,int a,int b){
        Node lca = Lca(root,a,b);
        int dist1 = lcaDist(lca,a);
        int dist2 = lcaDist(lca,b);

        return dist1 + dist2;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int a = 4;
        int b = 6;

        System.out.println(minDistance(root,4,6));
    }
}