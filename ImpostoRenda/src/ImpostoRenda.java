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
                
                //--------------------------------Cálculo de Salário Anual--------------------------------//
                Double salario = 0.0;
                for (int i = 1; i < 13; i++){
                        System.out.println("Informe seus rendimentos de "+i+ "/2024");
                        salario += scan.nextDouble();
                }

                //----------------------------------Cálculo de Imposto------------------------------------//
                Double baseCalculo, aliquota, impostoBruto, deducao, impostoLiquido;
                baseCalculo = salario*0.8;
                        if (baseCalculo <= 27870.40){
                                aliquota = 0.0;
                                impostoBruto = baseCalculo*(aliquota/100);
                                deducao = 0.0;
                                impostoLiquido = impostoBruto - deducao;
                        } else if (baseCalculo >= 27870.41 && baseCalculo <= 37751.55){
                                aliquota = 7.5;
                                impostoBruto = baseCalculo*(aliquota/100);
                                deducao = 2089.83;
                                impostoLiquido = impostoBruto - deducao;
                        } else if (baseCalculo >= 37751.56 && baseCalculo <= 50148.25){
                                aliquota = 15.0;
                                impostoBruto = baseCalculo*(aliquota/100);
                                deducao = 5268.16;
                                impostoLiquido = impostoBruto - deducao;
                        } else if (baseCalculo >= 50148.26 && baseCalculo <= 64259.59){
                                aliquota = 22.5;
                                impostoBruto = baseCalculo*(aliquota/100);
                                deducao = 9576.05;
                                impostoLiquido = impostoBruto - deducao;
                        } else {
                                aliquota = 27.5;
                                impostoBruto = baseCalculo*(aliquota/100);
                                deducao = 13932.41;
                                impostoLiquido = impostoBruto - deducao;
                        }
                //---------------------------------------Saídas-------------------------------------------//
                
                System.out.println("--------------------------------------------------------------------");
                System.out.println(nome+", seu rendimento anual foi de: R$ "+salario);
                System.out.printf("Base de cálculo: R$ %.2f\n",baseCalculo);
                System.out.println("Alíquota: "+aliquota+"%");
                System.out.printf("Imposto bruto: R$ %.2f\n",impostoBruto);
                System.out.printf("Dedução de Imposto: R$ %.2f\n",deducao);
                System.out.printf("Imposto a pagar: R$ %.2f\n",impostoLiquido);
                System.out.println("--------------------------------------------------------------------");

                scan.close();
	}

}
