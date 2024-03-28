import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Eventos {
	
	protected String titulo;
	protected String descricao;
	protected LocalDate dataInicio;
	protected LocalDate dataFim;
	protected String localização;
	protected List<String> participantes;
	
	public Eventos(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localização) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.localização = localização;
		this.participantes = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescrição() {
		return descricao;
	}

	public LocalDate getDataDeInicio() {
		return dataInicio;
	}

	public LocalDate getDataDeFim() {
		return dataFim;
	}

	public String getLocalização() {
		return localização;
	}
	
	public List<String> getParticipantes() {
		return participantes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dataFim, dataInicio, descricao, localização, participantes, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eventos other = (Eventos) obj;
		return Objects.equals(dataFim, other.dataFim) && Objects.equals(dataInicio, other.dataInicio)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(localização, other.localização)
				&& Objects.equals(participantes, other.participantes) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Eventos [titulo=" + titulo + ", descrição=" + descricao + ", dataDeInicio=" + dataInicio
				+ ", dataDeFim=" + dataFim + ", localização=" + localização + ", participantes=" + participantes
				+ "]";
	}

    public void adicionarParticipante(String participante) {
        participantes.add(participante);
    }

    public void removerParticipante(String participante) {
        participantes.remove(participante);
    }

    public void imprimirParticipantes() {
        for (String participante : participantes) {
            System.out.println(participante);
        }
	
	}
}


