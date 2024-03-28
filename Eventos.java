import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Eventos {
	
	protected String titulo;
	protected String descricao;
	protected LocalDate dataInicio;
	protected LocalDate dataFim;
	protected String localiza��o;
	protected List<String> participantes;
	
	public Eventos(String titulo, String descricao, LocalDate dataInicio, LocalDate dataFim, String localiza��o) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.localiza��o = localiza��o;
		this.participantes = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescri��o() {
		return descricao;
	}

	public LocalDate getDataDeInicio() {
		return dataInicio;
	}

	public LocalDate getDataDeFim() {
		return dataFim;
	}

	public String getLocaliza��o() {
		return localiza��o;
	}
	
	public List<String> getParticipantes() {
		return participantes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dataFim, dataInicio, descricao, localiza��o, participantes, titulo);
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
				&& Objects.equals(descricao, other.descricao) && Objects.equals(localiza��o, other.localiza��o)
				&& Objects.equals(participantes, other.participantes) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Eventos [titulo=" + titulo + ", descri��o=" + descricao + ", dataDeInicio=" + dataInicio
				+ ", dataDeFim=" + dataFim + ", localiza��o=" + localiza��o + ", participantes=" + participantes
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


