import dominio.Funcionario;
import dominio.cargos.Cargo;
import dominio.cargos.Vendedor;
import servicos.ServicoCalculaAnos;
import servicos.ServicoCalculaSalario;


public class Main {
    public static void main(String[] args) {
        ServicoCalculaAnos calc = new ServicoCalculaAnos();
        ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
        Funcionario funcionario = new Funcionario(
                1
                , "Teste"
                , new Vendedor(5000.00)
                , "2018-01-01");
        funcionario.exibeFuncionario();
    }
}