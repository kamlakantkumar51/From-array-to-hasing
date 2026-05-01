public class largest {
    public static int largestno(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,4,6,8,10};

        int result = largestno(numbers);
        System.out.println(("largest number is:"+result));
        
    }
}
