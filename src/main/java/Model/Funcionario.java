package Model;

/**
 *
 * @author Davi Wolff
 */
public class Funcionario {
    
    private String nome;
    private String contato;
    private int experiencia;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(String nome, String contato, int experiencia, int idade) {
        this.nome = nome;
        this.contato = contato;
        this.experiencia = experiencia;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario:" + "\nNome: " + nome + "\nContato: " + contato + " anos" +"\nExperiencia: " + experiencia + "\nIdade: " + idade + " anos";
    }
    
    
    
}
