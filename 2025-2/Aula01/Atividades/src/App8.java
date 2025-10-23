public class App8 {
    public static void main(String[] args) throws Exception{
        int linkin[] =  {14, 25, 37, 41 , 88};

        int park = linkin[0];
        for(int crawling = 1; crawling < linkin.length; crawling++){
            if(park < linkin[crawling]){
                System.out.println(park + " era menor que " + linkin[crawling]);
                park = linkin[crawling];
                crawling = 1;
            }
        }
        System.out.println("Portanto, o maior número deste array é: " + park);
    }
}
