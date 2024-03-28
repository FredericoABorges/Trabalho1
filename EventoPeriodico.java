import java.time.LocalDate;

public class EventoPeriodico extends Eventos{
	
	protected DiaSemana diaSemana;


	public EventoPeriodico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localiza��o) {
		super(titulo, descricao, dataInicio, dataFim, localiza��o);
	}


	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	
	
}
