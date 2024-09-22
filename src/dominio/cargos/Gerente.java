package dominio.cargos;

public class Gerente extends Cargo{
    public Gerente(int anosServico){
        super(20000.00, anosServico);
    }

    @Override
    public Double calculaAnosServico() {
        return this.getAnosServico() * 3000.00;
    }

    @Override
    public Double calculaSalario(){
        return this.getSalario() + calculaAnosServico();
    }
}
