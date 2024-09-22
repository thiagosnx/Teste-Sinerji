package servicos;

import dominio.cargos.Cargo;

public class ServicoCalculaSalario {
    public Double calculaSalario(Cargo cargo){
        Double salario = cargo.calculaSalario();
        return salario;
    }
}
