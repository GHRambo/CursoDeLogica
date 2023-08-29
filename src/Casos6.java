public class Casos6 {
    public static void main(String[] args) {
        char ramo ='C' ;
        int anoDaFaculdade = 4 ;
        switch (anoDaFaculdade){
            case 1:
                System.out.println("Inglês, Matematica e Ciências.");
                break;
            case 2:
                switch (ramo){
                    case 'C':
                        System.out.println("Sistemas Operacionais, Java, Estruturas de dados");
                        break;
                    case 'E':
                        System.out.println("Micro processadores, Teoria da Lógica da Programação");
                    case 'M':
                        System.out.println("Desenho, Máquinas de Fabricação");
                        break;
                }
                break;
            case 3:
                switch (ramo){
                    case 'C':
                        System.out.println("Organização Computacional, Multimédia");
                }
            case 'E':
                System.out.println("Fundamentos de lógica e Design");
                break;
            case 'M':
                System.out.println("Motores de combustão interna, Vibração Mecânica");
                break;
            case 4:
                switch (ramo){
                    case 'C':
                        System.out.println("Comunicação de dados e redes, Multimédia");
                        break;
                    case 'E':
                        System.out.println("Systemas Embarcados, Processamento de Imagem");
                        break;
                    case 'M':
                        System.out.println("Produção Tecnológica, Energia Térmica");
                }
                break;
        }
    }
}
