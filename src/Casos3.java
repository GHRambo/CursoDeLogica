import java.util.Scanner;

public class Casos3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.println("Digite uma letra: ");
        char ch = in.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Vogal");
                break;
            case 'e':
                System.out.println("Vogal");
                break;
            case 'i':
                System.out.println("Vogal");
                break;
            case 'o':
                System.out.println("Vogal");
                break;
            case 'u':
                System.out.println("Vogal");
                break;
            case 'A':
                System.out.println("Vogal");
                break;
            case 'E':
                System.out.println("Vogal");
                break;
            case 'I':
                System.out.println("Vogal");
                break;
            case 'O':
                System.out.println("Vogal");
                break;
            case 'U':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}
