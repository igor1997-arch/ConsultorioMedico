import java.util.Date;

public class ExameMedico extends Servico {
    private String tipologia;

    public ExameMedico(Date dh, double c, String t) {
        super(dh, c);
        this.tipologia = t;
    }
}
