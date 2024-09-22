package dominio.cargos;

public class Vendedor extends Cargo {
    public Double totalVendido;

    public Double getVendas(){
        return totalVendido;
    }

    public Vendedor(Double totalVendido){
        super(12000.00);
        this.totalVendido = totalVendido;
    }

    @Override
    public Double calculaAnosServico() {
        return this.getAnosServico() * 1800.00;
    }

    public Double calculaBeneficio(){
        return totalVendido * 0.30;
    }

    public Double getTotalVendido(){
        return totalVendido;
    }
    public void setTotalVendido(Double totalVendido){
        this.totalVendido = totalVendido;
    }

    @Override
    public Double calculaSalario(){
        return this.getSalario() + calculaAnosServico() + calculaBeneficio();
    }

    @Override
    public Double calculaSalarioSemBeneficio() {
        return this.getSalario() + calculaAnosServico();
    }
}
