package dominio.cargos;

public class Vendedor extends Cargo {
    public Vendedor(int anosServico){
        super(12000.00, anosServico);
    }

    @Override
    public Double calculaAnosServico() {
        return null;
    }

    @Override
    public Double calculaSalario(){
        return this.getSalario() * 0.20;
    }
}
