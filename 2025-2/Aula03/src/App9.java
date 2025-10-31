public class App9 {
    public static void main(String[] args){
        int nums[] = {10, 20, 30, 40, 50};
        int numsContra[] = new int[nums.length];

        for(int cont = 0; cont < nums.length; cont++){
            numsContra[((nums.length - 1) - cont)] = nums[cont];
        }

        for(int cont = 0; cont < numsContra.length; cont++){
            System.out.println(numsContra[cont]);
        }
    }
}