package dominio.cargos;

public class Secretario extends Cargo{

    public Secretario(int anosServico) {
        super(7000.00, anosServico);
    }

    @Override
    public Double calculaAnosServico(){
        return this.getAnosServico() * 1000.00;
    }
    @Override
    public Double calculaSalario(){
        Double base = this.getSalario() + calculaAnosServico();
        Double beneficio = this.getSalario() * 0.20;
        return base + beneficio;
    }
}
