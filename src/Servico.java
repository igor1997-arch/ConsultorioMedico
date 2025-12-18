import java.util.Date;

public class Servico {
    protected int cod;
    protected Date datahora;
    protected double custo;
    protected Paciente paciente;

    public Servico(Date dh, double c) {
        this.datahora = dh;
        this.custo = c;
    }

    public int getCod() {
        return cod;
    }

    public Date getDatahora() {
        return datahora;
    }

    public double getCusto() {
        return custo;
    }

    public boolean assignPaciente(Paciente p) {
        if (p != null) {
            this.paciente = p;
            return true;
        }
        return false;
    }
}
