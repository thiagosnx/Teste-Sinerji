import dominio.cargos.Cargo;
import dominio.cargos.Gerente;
import dominio.cargos.Secretario;
import dominio.cargos.Vendedor;
import servicos.ServicoCalculaSalario;

public class Main {
    public static void main(String[] args) {
        ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
        Cargo s = new Secretario(1);
        Cargo v = new Vendedor(1, 5000.00);
        Cargo g = new Gerente(1);
        System.out.println("Secretario:" + servicoCalculaSalario.calculaSalario(s));
        System.out.println("Vendedor:" + servicoCalculaSalario.calculaSalario(v));
        System.out.println("Gerente:" + servicoCalculaSalario.calculaSalario(g));
    }
}