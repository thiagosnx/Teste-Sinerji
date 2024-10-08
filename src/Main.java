import dominio.Funcionario;
import dominio.cargos.Gerente;
import dominio.cargos.Secretario;
import dominio.cargos.Vendedor;
import servicos.ServicoFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        ServicoFuncionario servicoFuncionario = new ServicoFuncionario();
        servicoFuncionario.criaFuncionarios();
       
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 7){
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ver lista dos funcionários, seus respectivos salários e benefícios e o valor total pago a eles.");
            System.out.println("2. Ver lista dos funcionários, seus salários e o valor total pago a eles excluídos os benefícios.");
            System.out.println("3. Ver lista somente dos funcionários que recebem benefícios e o valor total pago a eles em benefícios no mês");
            System.out.println("4. Ver funcionário que recebeu maior salário no mês.");
            System.out.println("5. Ver funcionário que recebeu a maior quantia em benefícios no mês.");
            System.out.println("6. Ver funcionário que mais vendeu no mês.");
            System.out.println("7. Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    servicoFuncionario.retornaFuncionarioCompleto();
                    break;
                case 2:
                    servicoFuncionario.retornaFuncionarioSemBeneficio();
                    break;
                case 3:
                    servicoFuncionario.retornaBeneficioFuncionario();
                    break;
                case 4:
                    servicoFuncionario.retornaMaiorSalario();
                    break;
                case 5:
                    servicoFuncionario.retornaMaiorBeneficio();
                    break;
                case 6:
                    servicoFuncionario.retornaMaiorVendedor();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}