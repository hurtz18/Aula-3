import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a matrícula do funcionário: ");
        String matricula = sc.nextLine();

        System.out.print("Informe o nome completo do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Informe o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        // Processamento dos dados
        double descontoINSS = salarioBruto * 0.15; // Desconto de 15% do INSS
        double salarioLiquido = salarioBruto - descontoINSS;

        // Exibição do contracheque
        System.out.println("\nContracheque:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome completo: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
///////////////////////////////////////////


import java.util.Scanner;

public class SituacaoAcademica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Determinação da situação acadêmica
        String situacao;
        if (media >= 70) {
            situacao = "Aprovado";
        } else if (media < 40) {
            situacao = "Reprovado";
        } else {
///////////////////////////////////////////////


 import java.util.Scanner;

            public class Calculadora {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int opcao;

                    do {
                        // Menu de opções
                        System.out.println("Escolha uma operação:");
                        System.out.println("1 - Soma");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Divisão");
                        System.out.println("4 - Multiplicação");
                        System.out.println("0 - Sair");
                        System.out.print("Digite sua opção: ");
                        opcao = sc.nextInt();

                        // Processar a escolha do usuário
                        if (opcao != 0) {
                            System.out.print("Digite o primeiro número: ");
                            double num1 = sc.nextDouble();
                            System.out.print("Digite o segundo número: ");
                            double num2 = sc.nextDouble();

                            switch (opcao) {
                                case 1:
                                    System.out.printf("Resultado da soma: %.2f%n", num1 + num2);
                                    break;
                                case 2:
                                    System.out.printf("Resultado da subtração: %.2f%n", num1 - num2);

