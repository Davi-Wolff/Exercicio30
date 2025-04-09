package Model;

import java.text.DecimalFormat;

/**
 *
 * @author Davi Wolff
 */
public class Aluno {
    
    DecimalFormat dc = new DecimalFormat("0.00");
    
    private int id;
    private Double altura;
    private Double peso;
    private String nome;
    private String objetivo;
    
    
    
    
    public Aluno(int id) {
        this.id = id;
    }

    public Aluno(Double altura, Double peso, String nome, String objetivo) {
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.objetivo = objetivo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double calculadorIMC() {
        return (getPeso()/Math.pow(getAltura(),2));
    }
    
    
    @Override
    public String toString() {
        return "Aluno: " + "\nId: " + id + "\nAltura: " + altura + "\nPeso: " + peso + "\nNome: " + nome + "\nObjetivo: " + objetivo + "\nIMC: " + dc.format(calculadorIMC());
    }
    
    
}
