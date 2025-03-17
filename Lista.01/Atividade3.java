import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args){
        
       int A,B;
       
       Scanner leitor = new Scanner(System.in);
       A = leitor.nextInt();
       B = leitor.nextInt();
       
       int X = A + B;
       
       System.out.print("X = " + X + "\n");
    }
}   