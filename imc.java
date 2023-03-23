
import java.util.Scanner;

public class imc {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********IMC***********\n");

        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome + " sua idade é " + idade + " \nSeja bem vindo à calculadora de IMC ");

        System.out.println("Para começar digite o seu peso (kg)");
        double peso = scanner.nextInt();

        System.out.println("Digite a seu altura (cm)");
        double altura = scanner.nextInt();
        altura = altura/100;
        

        double imc = peso / (altura * altura);
        System.out.println("O seu IMC é " + imc);


        if(imc < 18.5) {
            System.out.println("O seu imc é classificado em baixo peso");
        } else if ( imc >= 18.5 && imc<25) {
            System.out.println("O seu IMC é classificado em eutrofia");
        } else if (imc >=25 && imc < 30) {
            System.out.println("O seu IMC foi classificado como sobrepeso");
        } else {
            System.out.println("Obesidade");
        }


    }  
}
