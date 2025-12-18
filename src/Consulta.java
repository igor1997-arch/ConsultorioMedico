import java.util.Date;

public class Consulta extends Servico {
    private String diagnostico;

    public Consulta(Date dh, double c) {
        super(dh, c);
    }

    public void setDiagnostico(String d) {
        this.diagnostico = d;
    }
}
