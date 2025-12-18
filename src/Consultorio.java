import java.util.ArrayList;
import java.util.Date;

public class Consultorio {
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();
    private int nextCod = 1;

    public Consultorio() {}

    public boolean addPaciente(String n) {
        Paciente p = new Paciente(nextCod);
        p.setNome(n);
        pacientes.add(p);
        nextCod++;
        return true;
    }

    public boolean addConsulta(Date dh, double c) {
        Consulta cons = new Consulta(dh, c);
        cons.cod = nextCod++;
        servicos.add(cons);
        return true;
    }

    public boolean addExameMedico(Date dh, double c, String t) {
        ExameMedico ex = new ExameMedico(dh, c, t);
        ex.cod = nextCod++;
        servicos.add(ex);
        return true;
    }

    public boolean assignServicoPaciente(int cod, int numID) {
        Servico s = findServicoByCod(cod);
        Paciente p = findPacienteByID(numID);

        if (s != null && p != null) {
            return s.assignPaciente(p);
        }
        return false;
    }

    private Servico findServicoByCod(int cod) {
        for (Servico s : servicos) {
            if (s.cod == cod) return s;
        }
        return null;
    }

    private Paciente findPacienteByID(int id) {
        for (Paciente p : pacientes) {
            if (p.getNumID() == id) return p;
        }
        return null;
    }

    public double calculaValorRecebido() {
        double total = 0;
        for (Servico s : servicos) {
            total += s.getCusto();
        }
        return total;
    }
}
