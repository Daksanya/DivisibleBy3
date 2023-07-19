import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i]= scanner.nextInt();
        }

        System.out.println(divisibleBy3(array,n));
    }
    static int divisibleBy3(int[] array,int n){
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=array[i];
        }
        if(sum%3==0){
            return 1;
        }
        return 0;
    }
}
