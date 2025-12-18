import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        // Adicionar pacientes
        consultorio.addPaciente("Ana Silva");
        consultorio.addPaciente("João Pereira");

        // Adicionar serviços
        consultorio.addConsulta(new Date(), 40.0);
        consultorio.addExameMedico(new Date(), 80.0, "Raio-X");

        // Associar serviços a pacientes
        consultorio.assignServicoPaciente(3, 1); // Consulta → Ana
        consultorio.assignServicoPaciente(4, 2); // Exame → João

        // Mostrar valor total recebido
        System.out.println("Valor total recebido: "
                + consultorio.calculaValorRecebido() + " €");
    }

}