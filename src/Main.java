import dominio.cargos.Cargo;
import dominio.cargos.Secretario;
import servicos.ServicoCalculaSalario;

public class Main {
    public static void main(String[] args) {
        ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
        Cargo s = new Secretario(4);
        System.out.println(servicoCalculaSalario.calculaSalario(s));
    }
}