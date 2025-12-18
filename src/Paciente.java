public class Paciente {
    private int numID;
    private String nome;

    public Paciente(int n) {
        this.numID = n;
        this.nome = "";
    }

    public int getNumID() {
        return numID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

