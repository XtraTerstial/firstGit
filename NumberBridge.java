import java.util.Scanner;
public class NumberBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and Columns");
        int r = sc.nextInt();
        for(int i=1;i<=2*r-1;i++) { // rows
            System.out.print(i+ " ");
        }
        System.out.println();
        for(int i=1;i<=r;i++){ // rows
            int a=1;
            for (int j=1; j<=r-i;j++){ //stars
                System.out.print(a++ +" ");
            }
            for (int j=1; j<=2*i-1;j++){ //space printing
                System.out.print(" "+" ");
                a++; //very very important
            }
            for (int j=r-i; j>=1;j--){ //stars
                System.out.print(a++ +" ");
            }

            System.out.println();
        }
    }
}