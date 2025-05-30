import java.util.Scanner;
import java.text.DecimalFormat;

public class ImpostoRenda {

	public static void main(String[] args) {
                Scanner scan = new Scanner (System.in);
                DecimalFormat df = new DecimalFormat("#,##0.00");

                //--------------------------------Primeiras Informações-----------------------------------//
                System.out.println("***Bem Vindo ao Informe de Rendimentos 2025***");
                String nome, cpf;

                System.out.println("Insira seu nome completo: ");
                nome = scan.nextLine();

                System.out.println("Insira seu cpf: ");
                cpf = scan.nextLine();
                
                //--------------------------------Cálculo de Salário Anual--------------------------------//
                Double salario = 0.0, decimo = 0.0;
                for (int i = 1; i < 13; i++){
                        System.out.println("Informe seus rendimentos de "+i+ "/2024");
                        salario += scan.nextDouble();
                }
                System.out.println("Informe seu décimo terceiro:");
                decimo = scan.nextDouble();

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
                
                System.out.println("--------------------Seu informe de redimentos 2025-------------------");
                System.out.println("Contribuinte: "+nome);
                System.out.println("CPF: "+cpf);
                System.out.println("Rendimento anual foi de: R$ "+salario);
                System.out.println("Décimo terceiro: R$ "+ decimo);
                System.out.printf("Base de cálculo (rendimento tributável): R$ %.2f\n",baseCalculo);
                System.out.println("Alíquota: "+aliquota+"%");
                System.out.printf("Imposto bruto: R$ %.2f\n",impostoBruto);
                System.out.printf("Dedução de Imposto na fonte: R$ %.2f\n",deducao);
                System.out.printf("Imposto a pagar: R$ %.2f\n",impostoLiquido);
                System.out.println("--------------------------------------------------------------------");

                scan.close();
	}

        public static double fomatarCPF(String cpf){
                return cpf.substring(0,2) + "." + cpf.substring(3,5) + "." + cpf.substring(6,8) + "-" + cpf.substring(9);
        }
}
