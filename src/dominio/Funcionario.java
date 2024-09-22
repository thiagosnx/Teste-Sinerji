package dominio;

import dominio.cargos.Cargo;
import servicos.ServicoCalculaSalario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Funcionario {
    private int id;
    private String nome;
    private Cargo cargo;
    private LocalDate dtContratacao;

    public Funcionario(int id, String nome, Cargo cargo, String dtContratacao){
        this.id  = id;
        this.nome = nome;
        this.cargo = cargo;
        this.dtContratacao = LocalDate.parse(dtContratacao
                                            , DateTimeFormatter
                                                    .ofPattern("yyyy-MM-dd"));
        cargo.setAnosServico(getAnosServico());
    }

    public long getAnosServico(){
        return ChronoUnit.YEARS.between(dtContratacao, LocalDate.now());
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Cargo getCargo(){
        return cargo;
    }
    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }
    public LocalDate getDtContratacao(){
        return dtContratacao;
    }

    public void setDtContratacao(LocalDate dtContratacao){
    }
    ServicoCalculaSalario servicoCalculaSalario = new ServicoCalculaSalario();
    public void exibeFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo.getClass().getSimpleName());
        System.out.println("Anos de Casa: " + getAnosServico());
        System.out.println("Salário total: " + servicoCalculaSalario.calculaSalario(cargo));
    }
}
