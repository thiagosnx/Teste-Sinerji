package dominio.cargos;

public class Gerente extends Cargo{
    public Gerente(){
        super(20000.00);
    }

    @Override
    public Double calculaBeneficio() {
        return null;
    }

    @Override
    public Double calculaAnosServico() {
        return this.getAnosServico() * 3000.00;
    }

    @Override
    public Double calculaSalario(){
        return this.getSalario() + calculaAnosServico();
    }
    @Override
    public Double calculaSalarioSemBeneficio() {
        return this.getSalario() + calculaAnosServico();
    }
}
