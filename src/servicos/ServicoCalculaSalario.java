package servicos;

import dominio.cargos.Cargo;

public class ServicoCalculaSalario {
    public Double calculaSalario(Cargo cargo){
        Double salario = cargo.calculaSalario();
        return salario;
    }
    public Double calculaSalarioSemBeneficios(Cargo cargo){
        Double salario = cargo.calculaSalarioSemBeneficio();
        return salario;
    }
    public Double calculaBeneficio(Cargo cargo){
        Double salario = cargo.calculaBeneficio();
        return salario;
    }

}
