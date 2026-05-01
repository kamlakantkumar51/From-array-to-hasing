// // import java.util.*;
// // //ACTIVITY SELECTION PROBLEM//TIME COMPLEXITY = O(N)
// // // class solution{
// // //     public static void main(String args[]){
// // //         int start[] = {1,3,0,5,8,5};
// // //         int end[] = {2,4,6,7,9,9};

// // //         int max = 0;
// // //         ArrayList<Integer> ans = new ArrayList<>();
// // //         max = 1;
// // //         ans.add(0);
// // //         int last = end[0];
// // //         for(int i=1;i<end.length;i++){
// // //             if(start[i]>= last){
// // //                 max++;
// // //                 ans.add(i);
// // //                 last = end[i];
// // //             }
// // //         }
// // //         System.out.println("maximum activities = "+max);
// // //         for(int i=0;i<ans.size();i++){
// // //             System.out.print("A"+ans.get(i)+ "");
// // //         }
// // //         System.out.println();
// // //     }

// // // }

// // //BY 2D ARRAY//TIME COMPLEXITY = O(NLOGN)
// // class solution{
// //     public static void main(String args[]){
// //         int start[] = {1,3,0,5,8,5};
// //         int end[] = {2,4,6,7,9,9};

// //         //SORTING
// //         int activities[][] = new int[start.length][3];
// //         for(int i=0;i<start.length;i++){
// //             activities[i][0] = i;
// //             activities[i][1] = start[i];
// //             activities[i][2] = end[i];
// //         }
// //         //lambda function for sorting
// //         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

// //         int max = 0;
// //         ArrayList<Integer> ans = new ArrayList<>();
// //         max = 1;
// //         ans.add(activities[0][0]);
// //         int last = activities[0][2];
// //         for(int i=1;i<activities.length;i++){
// //             if(activities[i][1]>= last){
// //                 max++;
// //                 ans.add(activities[i][0]);
// //                 last = activities[i][2];
// //             }
// //         }
// //         System.out.println("maximum activities = "+max);
// //         for(int i=0;i<ans.size();i++){
// //             System.out.print("A"+ans.get(i)+ "");
// //         }
// //         System.out.println();           
// //     }

// // }

// //fractional knapsack
// import java.util.*;
// class solution{
//     public static void main(String args[]){
//         int val[] = {60,100,120};
//         int weight[] = {10,20,30};
//         int W = 50;

//         double ratio[][] = new double[val.length][2];
//         //0th col >= index ;1stcol=>ratio
//         for(int i=0;i<val.length;i++){
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }
//         //ascending order sorting
//         Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
//         int capacity = W;
//         int finalvalue = 0;
//         for(int i=ratio.length-1;i>=0;i--){
//             int idx = (int)ratio[i][0];

//             if(capacity >= weight[idx]){
//                 finalvalue += val[idx];
//                 capacity -= weight[idx];
//             }else{
//                 //include fractional part
//                 finalvalue += ratio[i][1]*capacity;
//                 capacity = 0;
//             }
//         }
//         System.out.println("final value is "+finalvalue);
//     }
// }

//minimum absolute difference pair
import java.util.*;
// class solution{
//     public static void main(String args[]){
//         int a[] = {4,1,8,7};
//         int b[] = {2,3,6,5};

//         Arrays.sort(a);
//         Arrays.sort(b);

//         int minDiff = 0;
//         for(int i=0;i<a.length;i++){
//             minDiff += Math.abs(a[i]-b[i]);
//         }

//         System.out.println("minimum difference of pairs = "+minDiff);
//     }
// }

//Q. Maximum Length of Chain of Pairs
// class solution{
//     public static void main(String args[]){//O(nlogn)
//         int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
//         Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

//         int chainLen = 1;
//         int chainEnd = pairs[0][1];

//         for(int i=1;i<pairs.length;i++){
//             if(pairs[i][0] > chainEnd){
//                 chainLen++;
//                 chainEnd = pairs[i][1];

//             }
//         }
//         System.out.println("maximum length of chain = "+chainLen);
//     }
// }



//Q.INDIAN COIN

// class solution{
//     public static void main(String args[]){
//         Integer coins[] = {1,2,5,10,20,50,100,500,2000};

//         Arrays.sort(coins,Comparator.reverseOrder());

//         int count = 0;
//         int amount = 590;
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0;i<coins.length;i++){
//             if(coins[i]<=amount){
//                 while(coins[i] <= amount){
//                     count++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }

//         System.out.println("total minimum coins used = "+count);
//         for(int i=0;i<ans.size();i++){
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

    

//Q.JOB SEQUENCE PROBLEM
// class solution{
//     static class Job{
//         int deadline;
//         int profit;
//         int id;

//         public Job(int i,int d,int p){
//             id = i;
//             deadline = d;
//             profit = p;
//         }
//     }

//     public static void main(String args[]){
//         int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

//         ArrayList<Job>jobs = new ArrayList<>();

//         for(int i=0;i<jobInfo.length;i++){
//             jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
//         }

//         Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit);//descending order sorting

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i=0;i<jobs.size();i++){
//             Job curr = jobs.get(i);

//             if(curr.deadline > time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }
//         //print seq
//         System.out.println("max jobs = "+seq.size());
//         for(int i=0;i<seq.size();i++){
//             System.out.print(seq.get(i)+ "");
//         }
//         System.out.println();

//     }
// }


//Q.CHOCOLA PROBLEM

class solution{
    public static void main(String args[]){
        int n = 4,m=6;
        Integer costvert[] = {2,1,3,1,4};//m-1
        Integer costhor[] = {4,1,2};//n-1

        Arrays.sort(costvert,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());

        int h=0;
        int v=0;
        int hp=1,vp=1;
        int cost = 0;

        while(h < costhor.length && v < costvert.length){
            // vertical cost < horizontal cost
            if(costvert[v]<= costhor[h]){
                cost += (costhor[h]*vp);
                hp++;
                h++;
            }else{//vertical cut
                cost += (costvert[v]*hp);
                vp++;
                v++;
            }
        }
        while(h < costhor.length){
            cost += (costhor[h]*vp);
            hp++;
            h++;
        }
        while(v < costvert.length){
            cost += (costvert[v]*hp);
            vp++;
            v++;
        }

        System.out.println("minimum cost of cuts = "+cost);
        
    }
}
