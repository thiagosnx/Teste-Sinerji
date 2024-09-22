package dominio.cargos;

public abstract class Cargo {
    private Double salario;
    private int anosServico;
    public Cargo(Double salario, int anosServico){
        this.salario = salario;
        this.anosServico = anosServico;
    }

    public abstract Double calculaAnosServico();

    public abstract Double calculaSalario();
    public Double getSalario(){
        return salario;
    }
    public int getAnosServico(){
        return anosServico;
    }
}
