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


}
