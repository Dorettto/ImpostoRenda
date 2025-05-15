import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
                Scanner scan = new Scanner (System.in);

                //--------------------------------Primeiras Informações-----------------------------------//
                System.out.println("***Bem Vindo ao Programa de Declaração do Imposto sobre a Renda***");
                String cpf, nome;

                System.out.println("Insira seu nome completo: ");
                nome = scan.nextLine();

                System.out.println("Insira seu CPF: ");
                cpf = scan.nextLine();
                
                //----------------------------------Cálculo de Salário------------------------------------//
                Double salario = 0.0;
                for (int i = 1; i < 13; i++){
                        System.out.println("Insira seus rendimentos de "+i+ "/2024");
                        salario += scan.nextDouble();
                }
                

                
                


                scan.close();
	}

}
