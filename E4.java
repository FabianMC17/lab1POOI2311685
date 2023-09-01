import java.util.Scanner;

public class E4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero A: ");
        int numA=sc.nextInt();

        System.out.print("Introduzca el numero B: ");
        int numB=sc.nextInt();

        if (numA >= 0 && numB >= 0){
            System.out.println("True");
        } else if (numA < 0 && numB < 0){
            System.out.println("True");
        }
        sc.close();
    }
}
