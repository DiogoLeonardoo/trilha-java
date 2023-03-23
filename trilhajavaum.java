import java.util.Scanner;
    public class trilhajavaum {
       
        public static void main(String[] args) {
            boolean condicao1 = true;
            
            boolean condicao2 = false;


            //A condição 1 e a 2 são verdadeiras (&& = e)
            if(condicao1 && condicao2) {
                System.out.println("As duas condições são verdadeiras");
            }
                System.out.println("Fim");
          
                
            //Uma das duas é verdadeira 
            if(condicao1 || condicao2) {
                System.out.println("Uma das duas condições é verdadeira");
            }
        }
    }