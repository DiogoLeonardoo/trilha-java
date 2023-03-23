    import java.util.Scanner;
    public class trilha {

        public static void main(String[] args) {

            String nomeUm = "Diogo";
            String nomeDois = new String("Diogo");

                //comparação objetos 
            System.out.println(nomeUm.equals(nomeDois));

            int numero1 = 5;
            int numero2 = 9;

            boolean simNao = numero1 == numero2;

            if(numero1< numero2) { 
                //Se a expressão for verdadeira exiba;
                System.out.println("A nossa condição é verdadeira");
            }
            
            //Sempre irá mostrar na caracteristica booleana (True and False)
            System.out.println("número um é igual a número dois? " + simNao); 

            simNao = numero1 != numero2;
            
            System.out.println("número um é diferente a número dois? " + simNao);

            simNao = numero1>numero2;

            System.out.println("Número um é maior que numero 2? " + simNao);


            
           
            
            

                
                

            
                }
        }
