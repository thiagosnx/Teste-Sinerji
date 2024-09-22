package servicos;

import dominio.Funcionario;
import dominio.cargos.Gerente;
import dominio.cargos.Secretario;
import dominio.cargos.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ServicoFuncionario {
    List<Funcionario> funcionarios = new ArrayList<>();
    ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
    public void criaFuncionarios(){

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
    }
    public void retornaFuncionarioCompleto(){
        Double salarioTotal = 0.00;
        System.out.println("Salário dos funcionários com benefícios: " + "\n");
        for (Funcionario funcionario : funcionarios){
            salarioTotal += servicoCalculaSalario.calculaSalario(funcionario.getCargo());
            System.out.println(
                            "Nome: " + funcionario.getNome() + "\n" +
                            "Cargo: " + funcionario
                            .getCargo()
                            .getClass()
                            .getSimpleName() + "\n" +
                            "Anos de Casa: " + funcionario.getAnosServico() + "\n" +
                            "Salário do Funcionário: " + servicoCalculaSalario.calculaSalario(funcionario.getCargo()) + "\n"

            );
        }
        System.out.println("Valor total pago em salário e benefícios aos funcionários: " + salarioTotal + "\n");
    }
    public void retornaFuncionarioSemBeneficio(){
        Double salarioTotal = 0.00;
        System.out.println("Salário dos funcionários sem benefícios: " + "\n");
        for (Funcionario funcionario : funcionarios){
            salarioTotal += servicoCalculaSalario.calculaSalarioSemBeneficios(funcionario.getCargo());
            System.out.println(
                            "Nome: " + funcionario.getNome() + "\n" +
                            "Cargo: " + funcionario
                            .getCargo()
                            .getClass()
                            .getSimpleName() + "\n" +
                            "Anos de Casa: " + funcionario.getAnosServico() + "\n" +
                            "Salário do Funcionário: " + servicoCalculaSalario.calculaSalarioSemBeneficios(
                                    funcionario.getCargo()
                    )+ "\n"
            );
        }
        System.out.println("Valor total pago em salário aos funcionários: " + salarioTotal + "\n");
    }
    public void retornaBeneficioFuncionario(){
        Double salarioTotal = 0.00;
        System.out.println("Benefícios dos funcionários: " + "\n");
        for (Funcionario funcionario : funcionarios){
            if(servicoCalculaSalario.calculaBeneficio(funcionario.getCargo()) != null){
                salarioTotal += servicoCalculaSalario.calculaBeneficio(funcionario.getCargo());
                System.out.println(
                        "Nome: " + funcionario.getNome() + "\n" +
                                "Cargo: " + funcionario
                                .getCargo()
                                .getClass()
                                .getSimpleName() + "\n" +
                                "Anos de Casa: " + funcionario.getAnosServico() + "\n" +
                                "Benefícios do Funcionário: " + servicoCalculaSalario.calculaBeneficio(funcionario.getCargo()
                        )+ "\n"
                );
            }
        }
        System.out.println("Valor total pago em benefícios aos funcionários: " + salarioTotal + "\n");
    }
    public void retornaMaiorSalario(){
        Funcionario funcionarioMaiorSalario = null;
        Double maiorSalario = 0.00;
        for (Funcionario funcionario : funcionarios){
            Double salarioAtual = servicoCalculaSalario.calculaSalario(funcionario.getCargo());
            if(salarioAtual > maiorSalario){
                maiorSalario = salarioAtual;
                funcionarioMaiorSalario = funcionario;
            }
        }
        System.out.println(
                "Funcionário com maior salário: " + "\n" +
                "Nome: " + funcionarioMaiorSalario.getNome() + "\n" +
                        "Cargo: " + funcionarioMaiorSalario
                        .getCargo()
                        .getClass()
                        .getSimpleName() + "\n" +
                        "Anos de Casa: " + funcionarioMaiorSalario.getAnosServico() + "\n" +
                        "Salário do Funcionário: " + servicoCalculaSalario.calculaSalario(funcionarioMaiorSalario.getCargo()
                )+ "\n"
        );
    }
    public void retornaMaiorBeneficio(){
        Funcionario funcionarioMaiorBeneficio = null;
        Double maiorBeneficio = 0.00;
        for (Funcionario funcionario : funcionarios){
            if(servicoCalculaSalario.calculaBeneficio(funcionario.getCargo()) != null) {
                Double beneficioAtual = servicoCalculaSalario.calculaBeneficio(funcionario.getCargo());
                if (beneficioAtual > maiorBeneficio) {
                    maiorBeneficio = beneficioAtual;
                    funcionarioMaiorBeneficio = funcionario;
                }
            }
        }
        System.out.println(
                "Funcionário com maior benefício: " + "\n" +
                "Nome: " + funcionarioMaiorBeneficio.getNome() + "\n" +
                        "Cargo: " + funcionarioMaiorBeneficio
                        .getCargo()
                        .getClass()
                        .getSimpleName() + "\n" +
                        "Anos de Casa: " + funcionarioMaiorBeneficio.getAnosServico() + "\n" +
                        "Benefícios do Funcionário: " + servicoCalculaSalario.calculaBeneficio(funcionarioMaiorBeneficio.getCargo()
                )+ "\n"
        );
    }
    public void retornaMaiorVendedor(){
        Funcionario funcionarioMaiorVendedor = null;
        Double maiorVenda = 0.00;
        for (Funcionario funcionario : funcionarios){
            if(funcionario.getCargo() instanceof Vendedor) {
                Vendedor vendedor = (Vendedor) funcionario.getCargo();
                Double totalVendido = vendedor.getTotalVendido();
                if (totalVendido  > maiorVenda) {
                    maiorVenda = totalVendido;
                    funcionarioMaiorVendedor = funcionario;
                }
            }
        }
        System.out.println(
                "Funcionário que mais vendeu: " + "\n" +
                "Nome: " + funcionarioMaiorVendedor.getNome() + "\n" +
                        "Cargo: " + funcionarioMaiorVendedor
                        .getCargo()
                        .getClass()
                        .getSimpleName() + "\n" +
                        "Anos de Casa: " + funcionarioMaiorVendedor.getAnosServico() + "\n" +
                        "Total em Vendas: " + ((Vendedor) funcionarioMaiorVendedor.getCargo()).getTotalVendido(
                )+ "\n"
        );
    }


}
