import java.time.LocalDate;

public class EventoRecorrente extends Eventos{
	
	protected int intervalo;


	public EventoRecorrente(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localiza��o, int intervalo) {
		super(titulo, descricao, dataInicio, dataFim, localiza��o);
		this.intervalo = intervalo;
	}


	public int getIntervalo() {
		return intervalo;
	}
	
	

}
