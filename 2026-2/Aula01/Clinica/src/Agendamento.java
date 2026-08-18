import java.util.Date;
import java.sql.Time;

public class Agendamento {
    private int idAgendamento;
    private Date data;
    private Time hora;
    private String status;

    public Agendamento(int idAgendamento, Date data, Time hora, String status){
        this.idAgendamento = idAgendamento;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        String data = this.data.toString();
        String hora = this.hora.toString();
        return "ID: " + idAgendamento + "Data: " + data + "Hora: " + hora + "Status: " + status;
    }
}
