class Node{
    int data;
    Node left,right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
class sortedarraybst{
    public static Node sortedArrayToBst(int arr[],int start,int end){
        if(start > end){
            return null;
        }
        int mid = (start + end)/2;
        Node root = new Node(arr[mid]);
        root.left = sortedArrayToBst(arr,start,mid-1);
        root.right = sortedArrayToBst(arr,mid+1,end);

        return  root;
    }
    public static void printTree(Node root, int level) {
    if (root == null) return;

    printTree(root.right, level + 1);

    for (int i = 0; i < level; i++) {
        System.out.print("   ");
    }

    System.out.println(root.data);

    printTree(root.left, level + 1);
}
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};


        Node root = sortedArrayToBst(arr, 0, arr.length-1);

        System.out.println("balanced tree created!!");

        printTree(root, 0);
    }
}