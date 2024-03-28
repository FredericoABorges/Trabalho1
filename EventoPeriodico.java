import java.time.LocalDate;

public class EventoPeriodico extends Eventos{
	
	protected DiaSemana diaSemana;


	public EventoPeriodico(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localização) {
		super(titulo, descricao, dataInicio, dataFim, localização);
	}


	public DiaSemana getDiaSemana() {
		return diaSemana;
	}
	
	
}
