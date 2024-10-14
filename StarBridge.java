import java.util.Scanner;

public class StarBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and Columns");
        int r = sc.nextInt();
        for(int i=1;i<=2*r-1;i++) { // rows
            System.out.print("#" + " ");
        }
        System.out.println();
        for(int i=1;i<=r;i++){ // rows
            for (int j=1; j<=r-i;j++){ //stars
                System.out.print("*"+" ");
            }
            for (int j=1; j<=2*i-1;j++){ //space printing
                System.out.print(" "+" ");
            }
            for (int j=r-i; j>=1;j--){ //stars
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}