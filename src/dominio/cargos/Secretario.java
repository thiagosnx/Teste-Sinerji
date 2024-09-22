package dominio.cargos;

public class Secretario extends Cargo{

    public Secretario() {
        super(7000.00);
    }

    @Override
    public Double calculaBeneficio(){
        Double base = this.getSalario() + calculaAnosServico();
        return base * 0.20;
    }

    @Override
    public Double calculaAnosServico(){
        return this.getAnosServico() * 1000.00;
    }
    @Override
    public Double calculaSalario(){
        return this.getSalario() + calculaAnosServico() + calculaBeneficio();
    }

    @Override public Double calculaSalarioSemBeneficio(){
        return this.getSalario() + calculaAnosServico();
    }
}
