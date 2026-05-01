// //hashmap iteration
// import java.util.*;
// class hash{
//     public static void main(String args[]){
//         HashMap<String,Integer> map = new HashMap<>();
//         map.put("india",100);
//         map.put("china",150);
//         map.put("us",50);

//         //iteration using keyset
//         for(String key : map.keySet()){
//             System.out.println("key: " + key + " value: " + map.get(key));
//         }
//         //iteration using entryset
//         for(Map.Entry<String,Integer> e : map.entrySet()){
//             System.out.println("key: " + e.getKey() + " value: " + e.getValue());
//         }
//     }
// }
//linked hashmap
// import java.util.HashMap;
// import java.util.LinkedHashMap;
// class map{
//     public static void main(String args[]){
//         LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//         lhm.put("india",100);
//         lhm.put("china",150);
//         lhm.put("us",50);
//         HashMap<String,Integer> hm = new HashMap<>();
//         hm.put("india",100);
//         hm.put("china",150);
//         hm.put("us",50);
//         System.out.println(lhm);
//         System.out.println(hm);
//     }
// }
//Tree map
// import java.util.HashMap;
// class map{
//     public static void main(String args[]){
//         HashMap<String,Integer> tm = new HashMap<>();
//         tm.put("india",100);
//         tm.put("china",150);
//         tm.put("us",50);
//         System.out.println(tm);
//     }
// }
//majority element
//valid anagram
//hashset
// import java.util.HashSet;
// class hash{
//     public static void main(String args[]){
//         HashSet<Integer> set = new HashSet<>();
//         set.add(1);
//         set.add(2);
//         set.add(3);
//         set.add(2);
//         //operations
//         set.remove(2);
//         System.out.println(set);
//         if(set.contains(3)){
//             System.out.println("set contains 3");
//         }
//         System.out.println(set.size());
//         System.out.println(set.isEmpty());
//     }
// }
//iteration of hashset
// import java.util.*;
// class hash{
//     public static void main(String args[]){
//         HashSet<String> set = new HashSet<>();
//         set.add("patna");
//         set.add("gaya");
//         set.add("vadodra");
//         set.add("ahemdabad");
//         //1st way to iterate
//         // Iterator it = set.iterator();
//         // while(it.hasNext()){
//         //     System.out.println(it.next());
//         // }
//         //2nd way to iterate
//         for(String city:set){
//             System.out.println(city);
//         }
//     }
// }
//linkedhashset
// import java.util.*;
// class hash{
//     public static void main(String args[]){
//         LinkedHashSet<String> set = new LinkedHashSet<>();
//         set.add("patna");
//         set.add("gaya");
//         set.add("vadodra");
//         set.add("ahemdabad");
//         System.out.println(set);
//     }
// }
//treeset(red black tree)||(null valuest not allowed) || (internal sorting happens)
//     public static void main(String args[]){
//         TreeSet<String> set = new TreeSet<>();
//         set.add("patna");
//         set.add("gaya");
//         set.add("vadodra");
//         set.add("ahemdabad");
//         System.out.println(set);
//     }
// }
//Q.count distinct element
// class hash{
//     public static void main(String args[]){
//         int num[] = {4,3,2,5,6,7,3,4,2,1};
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<num.length;i++){
//             set.add(num[i]);
//         }
//         System.out.println(set.size());
//     }
// }
//union & intersection
// class hash{
//     public static void main(String args[]){
//         int arr1[] = {7,3,9};
//         int arr2[] = {6,3,9,2,9,4};
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             set.add(arr2[i]);
//         }
//         System.out.println("union = "+set.size());
//         //intersection
//         set.clear();
//         for(int i=0;i<arr1.length;i++){
//             set.add(arr1[i]);
//         }
//         int count = 0;
//         for(int i=0;i<arr2.length;i++){
//             if(set.contains(arr2[i])){
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }
//         System.out.println("intersection = "+count);
//     }
// }




//iteranary from ticket
// import java.util.*;

// class hash {

//     public static String getStart(HashMap<String, String> tickets) {
//         HashMap<String,String> revmap = new HashMap<>();
//         for(String key:tickets.keySet()){
//             revmap.put(tickets.get(key),key);

//         }

//         for(String key:tickets.keySet()){
//             if(!revmap.containsKey(key)){
//                 return key;//starting point
//             }
//         }
//         return null;


//     }

//     public static void main(String args[]) {
//         HashMap<String, String> tickets = new HashMap<>();

//         tickets.put("chennai", "bengalaru");
//         tickets.put("mumbai", "delhi");
//         tickets.put("goa", "chennai");
//         tickets.put("delhi", "goa");

        
//         String start = getStart(tickets);
//         System.out.print(start);
//         for(String key:tickets.keySet()){
//             System.out.print("->"+tickets.get(start));
//             start = tickets.get(start);
//         }
//         System.out.println();
//     }
// }



//largest subarray with sum 0
class hash{
    public static void main(String args[]){
        int num[] = {15, -2, 2, -8, 1, 7, 10, 23};

        int n = num.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += num[j];
                if(sum == 0){
                    max = Math.max(max,j-i+1);
                }
            }
            
        }
        System.out.println(max);
    }
}

//optimised code
// import java.util.*;
// class Solution {
//     int maxLength(int arr[]) {
//         // code here
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int sum = 0;
//         int max = 0;
        
//         for(int i=0;i<arr.length;i++){
//             sum += arr[i];
            
//             if(sum == 0){
//                 max = i+1;
//             }
//             if(map.containsKey(sum)){
//                 max = Math.max(max,i-map.get(sum));
//             }else{
//                 map.put(sum,i);
//             }
//         }
        
//         return max;
//     }
// }



// import java.util.*;
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer>map = new HashMap<>();
//         map.put(0,1);
//         int sum = 0;
//         int ans = 0;
//         for(int j=0;j<nums.length;j++){
//             sum += nums[j];
//             if(map.containsKey(sum-k)){
//                 ans += map.get(sum-k);
//             }
//             map.put(sum,map.getOrDefault(sum,0)+1);
//         }
//         return ans;
//     }
// }