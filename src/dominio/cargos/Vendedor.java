package dominio.cargos;

public class Vendedor extends Cargo {
    public Double totalVendido;

    public Double getVendas(){
        return totalVendido;
    }

    public Vendedor(int anosServico, Double totalVendido){
        super(12000.00, anosServico);
        this.totalVendido = totalVendido;
    }

    @Override
    public Double calculaAnosServico() {
        return this.getAnosServico() * 1800.00;
    }

    private Double calculaVendas(){
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
        return this.getSalario() + calculaAnosServico() + calculaVendas();
    }
}
