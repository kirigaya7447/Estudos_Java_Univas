public class App4 {
    public static void main(String[] args){
        int nums[] = {10, 20, 30, 40, 50};
        int mediaTotal = 0;
        for(int media : nums){
            mediaTotal = mediaTotal + media;
        }
        mediaTotal = mediaTotal / nums.length;
        System.out.println("Média total é " + mediaTotal);
    }
    
}
