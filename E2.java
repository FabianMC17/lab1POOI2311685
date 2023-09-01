import java.util.Scanner;

public class E2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num=sc.nextInt();
        if (num % 2 != 0){
            if(num >= 0){
                System.out.println("True");
            }
        }
        sc.close();
    }
}
