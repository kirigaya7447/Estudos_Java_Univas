import java.util.Arrays;

public class App5 {
    public static void main(String[] args){
        int nums[] = {90, 10, 70, 50};
        
        Arrays.sort(nums);
        for(int cont : nums){
         System.out.println(cont);   
        }
        System.out.println(Arrays.binarySearch(nums, 50));
        System.out.println(Arrays.binarySearch(nums, 91));



    }
}
