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
        funcionarios.add(
                new Funcionario(1
                , "Jorge Carvalho"
                , new Secretario()
                , "2018-01-01")
        );
        funcionarios.add(
                new Funcionario(2
                        , "Maria Souza"
                        , new Secretario()
                        , "2015-12-01")
        );
        funcionarios.add(
                new Funcionario(1
                        , "Ana Silva"
                        , new Vendedor(26250.00)
                        , "2021-12-01")
        );
        funcionarios.add(
                new Funcionario(1
                        , "João Mendes"
                        , new Vendedor(28500.00)
                        , "2021-12-01")
        );
        funcionarios.add(
                new Funcionario(1
                        , "Juliana Alves"
                        , new Gerente()
                        , "2017-07-01")
        );
        funcionarios.add(
                new Funcionario(1
                        , "Bento Albino"
                        , new Gerente()
                        , "2014-03-01")
        );
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 6){
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ver lista dos funcionários e seus respectivos salários e benefícios.");
            System.out.println("2. Ver lista dos funcionários e seus salários sem benefícios.");
            System.out.println("3. Ver lista somente dos funcionários que recebem benefícios");
            System.out.println("4. Ver funcionário que recebeu maior salário no mês.");
            System.out.println("5. Ver funcionário que recebeu a maior quantia em benefícios no mês.");
            System.out.println("6. Ver funcionário que mais vendeu no mês.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    servicoFuncionario.retornaFuncionarioCompleto();
                    break;
            }
        }

    }
}