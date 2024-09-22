package dominio.cargos;

public class Gerente extends Cargo{
    public Gerente(int anosServico){
        super(20000.00, anosServico);
    }

    @Override
    public Double calculaAnosServico() {
        return null;
    }

    @Override
    public Double calculaSalario(){
        return this.getSalario();
    }
}
