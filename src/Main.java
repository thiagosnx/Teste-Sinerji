import dominio.Funcionario;
import dominio.cargos.Cargo;
import dominio.cargos.Gerente;
import dominio.cargos.Secretario;
import dominio.cargos.Vendedor;
import servicos.ServicoCalculaAnos;
import servicos.ServicoCalculaSalario;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
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
                        , new Vendedor(1000.00)
                        , "2021-12-01")
        );
        funcionarios.add(
                new Funcionario(1
                        , "João Mendes"
                        , new Vendedor(1000.00)
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
        for (Funcionario funcionario : funcionarios){
            System.out.println(
                    "Nome: " + funcionario.getNome() + "\n" +
                    "Cargo: " + funcionario
                            .getCargo()
                            .getClass()
                            .getSimpleName() + "\n" +
                    "Anos de Casa: " + funcionario.getAnosServico() + "\n" +
                    "Salario Total: " + servicoCalculaSalario.calculaSalario(funcionario.getCargo()) + "\n"

            );
        }
    }
}