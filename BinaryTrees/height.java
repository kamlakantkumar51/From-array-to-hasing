public class height {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    //count of nodes
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);

        return leftcount+rightcount+1;
    }



    //sum of nodes
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);

        return leftsum+rightsum+root.data;
    }

    //diameter of binary tree||Time complexity:O(n^2)
    //approach-1
    // public static int diameter(Node root){
    //     if(root == null){
    //         return 0;
    //     }
    //     int leftdiameter = diameter(root.left);
    //     int leftheight = height(root.left);
    //     int rightdiameter = diameter(root.right);
    //     int rightheight = height(root.right);

    //     int selfdiameter = leftheight + rightheight+1;

    //     return Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));

    // }

//approach-2
    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftdiameter = diameter2(root.left);
        int leftheight = height(root.left);
        int rightdiameter = diameter2(root.right);
        int rightheight = height(root.right);

        int selfdiameter = leftheight + rightheight+1;

        return Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));

    }
    static class Info{
        int diameter;
        int height;
        public Info(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height + rightInfo.height+1);
        int height = Math.max(leftInfo.height,rightInfo.height)+1;
        return new Info(diam,height);
    }

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println("Height : " + height(root));

        // System.out.println("count of nodes:"+count(root));

        // System.out.println("sum of nodes:"+sum(root));

        // System.out.println("diameter of root:"+diameter(root));

        System.out.println("diameter of root:"+diameter(root).diameter);
        System.out.println("height of root:"+(diameter(root).height));
    }
    
}
