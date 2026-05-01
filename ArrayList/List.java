package ArrayList;

import java.util.*;
// class list{
//     public static void swap(ArrayList<Integer>list,int idx1,int idx2){
//         int temp  = list.get(idx1);
//         list.set(idx1,list.get(idx2));
//         list.set(idx2,temp);
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         ArrayList<String>list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         // System.out.println(list);

//         // //get operation
//         // int element  = list.get(2);
//         // System.out.println(element);

//         // //remove element
//         // list.remove(2);
//         // System.out.println(list);

//         //set

//         // list.set(2,10);
//         // System.out.println(list);

//         //contains element

//         // System.out.println(list.contains(1));
//         // System.out.println(list.contains(30));

//         //size

//         // System.out.println(list.size());

//         // //print the list
//         // for(int i=0;i<list.size();i++){
//         //     System.out.println(list.get(i));
//         // }
//         // System.out.println();

//         //reverse of an arraylist
//         // for(int i=list.size()-1;i>=0;i--){
//         //     System.out.print(list.get(i)+ " ");
//         // }
//         // System.out.println();

//         //find maximumnumber in arraylist
//         // int max = Integer.MIN_VALUE;
//         // for(int i=0;i<list.size();i++){
//         //     // if(max < list.get(i)){
//         //     //     max = list.get(i);
//         //     // }
//         //     max = Math.max(max,list.get(i));
//         // }
//         // System.out.println("max element = "+max);

//         //swap
//         // int idx1 = 1,idx2 = 3;
//         // System.out.println(list);
//         // swap(list, idx1, idx2);
//         // System.out.println(list);

//         //sorting
//         //before sorting
//         // System.out.println(list);
//         // Collections.sort(list);
//         // //after sorting
//         // System.out.println(list);//ascending

//         // //descending
//         // Collections.sort(list,Collections.reverseOrder());
//         // System.out.println(list);

//     }
// }

//multi dimensional arraylist
// class List{
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1);
//         list1.add(2);
//         mainList.add(list1);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3);
//         list2.add(4);

//         mainList.add(list2);

//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i=0;i<mainList.size();i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0;j<currList.size();j++){
//                 System.out.print(currList.get(j)+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

//the problem is to add 3 list in one arraylist
class List{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested loop

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

    }
}

//Q.Container with most water(bruteforce approach)
// class list{
//     public static int storewater(ArrayList<Integer> height){
//         int maxwater = 0;
//         //bruteforce
//         for(int i=0;i<height.size();i++){
//             for(int j=i+1;j<height.size();j++){
//                 int ht = Math.min(height.get(i),height.get(j));
//                 int width = j-i; 
//                 int currWater = ht * width;
//                 maxwater = Math.max(maxwater,currWater);
//             }
//         }
//         return maxwater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storewater(height));
//     }
// }

//TWO POINTER APPROACH
// class list {
//     public static int storewater(ArrayList<Integer> height){
//         int maximumWater = 0;
//         int lp = 0;
//         int rp = height.size()-1;
//         while(lp< rp){
//             //calculate water area
//             int ht = Math.min(height.get(lp),height.get(rp));
//             int width = rp-lp;
//             int currWater = ht * width;
//             maximumWater = Math.max(maximumWater,currWater);
//             //update ptr

//             if(height.get(lp) < height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return maximumWater;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storewater(height));
//     }
// }





//Q.PAIR SUM 1
// class list{
//     public static boolean pairSum1(ArrayList<Integer> list,int target){
//         for(int i=0;i<list.size();i++){
//             for(int j=i+1;j<list.size();j++){
//                 if(list.get(i)+ list.get(j) == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         //1,2,3,4,5
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int target = 5;

//         System.out.println(pairSum1(list, target));
//     }
// }


//TWO POINTER APPROACH
// class list{
//     public static boolean pairSum1(ArrayList<Integer> list,int target){
//         int lp = 0;
//         int rp = list.size()-1;
//         while(lp < rp){
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp) + list.get(rp) < target){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         //1,2,3,4,5
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int target = 5;

//         System.out.println(pairSum1(list, target));
//     }
// }



//PAIRSUM 2(SORTED ARRAYLIST)

// class list{
//     public static boolean pairSum2(ArrayList<Integer> list,int target){
//         int bp = -1;
//         for(int i=0;i<list.size();i++){
//             if(list.get(i) > list.get(i+1)){
//                 bp = i;
//                 break;
//             }
//         }
//         int lp = bp+1;
//         int rp = bp;

//         while(lp!= rp){
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp) + list.get(rp) < target){
//                 lp = (lp +1) % list.size();
//             }else{
//                 rp = (rp -1 + list.size()) % list.size();
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         //11,15,6,8,9,10
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);

//         int target = 16;
//         System.out.println(pairSum2(list, target));
//     }
// }