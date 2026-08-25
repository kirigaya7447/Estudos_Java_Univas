import model.Paciente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(1, "João", sdf.parse("25/08/2026"), "11 111111111111", "teste@teste.com"));

        for(Paciente p : listaPacientes){
            System.out.println(p);
        }
    }
}
