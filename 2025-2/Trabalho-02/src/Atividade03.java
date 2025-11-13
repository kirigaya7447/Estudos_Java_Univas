public class app3 {
    public static void main(String[] args) {
        String[] times = { "Time A", "Time B", "Time C" };
        String[] turnos = { "Turno 1", "Turno 2" };
        for (int i = 0; i < turnos.length; i++) {
            for (int j = 0; j < times.length; j++) {
                for (int k = 0; k < times.length; k++) {
                    if (times[k] != times[j]) {
                        System.out.println(turnos[i] + ": " + times[j] + " vs " + times[k]);
                    }
                }
            }
        }
    }
}
