import java.time.LocalDate;

public class TestaSistema {

	public class Main {
		
	}
	    public static void main(String[] args) {
	    	
	        EventoUnico eventoUnico = new EventoUnico("Evento Único", "Formatura", LocalDate.of(2020, 1, 8), LocalDate.of(2024, 3, 27), "Local A");
	        eventoUnico.adicionarParticipante("Fred");
	        eventoUnico.adicionarParticipante("Dante");
	        System.out.println("Participantes do evento único:");
	        eventoUnico.imprimirParticipantes();

	       
	    }
	}