import java.time.LocalDate;

public class EventoRecorrente extends Eventos{
	
	protected int intervalo;


	public EventoRecorrente(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localização, int intervalo) {
		super(titulo, descricao, dataInicio, dataFim, localização);
		this.intervalo = intervalo;
	}


	public int getIntervalo() {
		return intervalo;
	}
	
	

}
