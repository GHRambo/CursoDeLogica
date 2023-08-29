import java.util.Scanner;

public class MainJokenpo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        byte escolha;

        do{
            System.out.println("[1] - JOGAR");
            System.out.println("[0] - JOGAR");
            System.out.println("Operação...");
            escolha = in.nextByte() ;

            switch (escolha){
                case 1:
                    System.out.println("Escolha sua Jogada:");
                    System.out.println("[1] - Pedra");
                    System.out.println("[2] - Papel");
                    System.out.println("[3] - Tesoura");
                    System.out.println("Operação: ");
                    byte jogada = in.nextByte() ;
                    Jogo jogo = new Jogo(jogada) ;
                    System.out.println("Resultado: " + jogo.verificarVencedor() + "\n") ;
                    break;
                case 0:
                    System.out.println();
            }
        }while(escolha != 0);
    }
}
