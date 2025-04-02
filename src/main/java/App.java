package main.java;
import java.util.Scanner;
import main.java.CorpoHumano;

public class App {
        //Comentário

    public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in); 

        //variável local a
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.printf(v2+" "+v1);
    }
    public static void main(String[] args) throws Exception {
        
        CorpoHumano c1 = new CorpoHumano(100, 150, 1.60, 49.1);

        // c1.massa = "2";
        // c1.setVolume(12000)


        //Exibir IMC
        System.out.println("IMC: " + c1.calcularIMC());

    }
}
