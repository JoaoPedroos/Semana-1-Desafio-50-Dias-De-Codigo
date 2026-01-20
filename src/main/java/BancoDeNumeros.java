import java.util.*;

public class BancoDeNumeros {
    public static void main(String[] args){


        int i;
        double media = 0;
        double soma = 0;
        Double verfMaior = 0.0;
        Double verfMenor = 1.7976931348623157E308;
        Scanner teclado = new Scanner(System.in);
        List<Double> listaNumeros = new ArrayList<>();


        System.out.println("");
        System.out.println("Você deseja guardar quantos numeros?");
        int n = teclado.nextInt();


        for(i = 1; i <= n; i++){
            System.out.println("Digite o "+ i +"° numero.");
            Double valores = teclado.nextDouble();

            if(valores.equals("") || valores == null){
                System.out.println("O valor inserido é inválido");
            }
            else{
                listaNumeros.add(valores);
                soma = soma + valores ;

                if(valores > verfMaior){
                    verfMaior = valores;
                } else{
                    System.out.println("");
                }
                if (valores < verfMenor) {
                    verfMenor = valores;
                }
                else{
                    System.out.println("");
                }
            }

        }

        media = soma / n;

        System.out.println("Média: "+media);
        System.out.println("Soma: "+soma);
        System.out.println("Maior N°: "+verfMaior);
        System.out.println("Menor N°: "+verfMenor);

    }

}
