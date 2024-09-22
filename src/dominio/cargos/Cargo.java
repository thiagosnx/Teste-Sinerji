package dominio.cargos;

public abstract class Cargo {
    private Double salario;
    private long anosServico;
    public Cargo(Double salario){
        this.salario = salario;
    }


    public abstract Double calculaAnosServico();

    public abstract Double calculaSalario();
    public Double getSalario(){
        return salario;
    }

    public void setAnosServico(long anos){
        this.anosServico = anos;
    }
    public long getAnosServico(){
        return anosServico;
    }
}
