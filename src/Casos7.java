public class Casos7 {
    public static void main(String[] args) {
        int idade = 18 ;
        switch (idade){
            case (16):
                System.out.println("Você tem menos de 18.");
                break ;
            case (18):
                System.out.println("Você é elegivel por voto.");
                break ;
            case (65):
                System.out.println("Você é velho.");
                break ;
            default:
                System.out.println("Por favor forneça uma idade válida.");
        }


    }
}
