package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private String titulo;
	private String descricao;
	private int curtida;
	private  List<Comentario> comentarios = new ArrayList<>();
	
	public Postagem() {
		
	}
	
	public Postagem(Date momento, String titulo, String descricao, int curtida) {
		super();
		this.momento = momento;
		this.titulo = titulo;
		this.descricao = descricao;
		this.curtida = curtida;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCurtida() {
		return curtida;
	}

	public void setCurtida(int curtida) {
		this.curtida = curtida;
	}

	//Cometarios é uma lista, logo nao se tem SET, é preciso criar um metodo que adicione o comenatario a lista
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void deletarComentario(Comentario comentario) {
		comentarios.remove(comentarios);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(curtida);
		sb.append(" LIKES - ");
		sb.append(sdf.format(momento) + "\n");		
		sb.append(descricao + "\n");
		sb.append("COMENTARIOS:\n");
		
		/*Instacia-se primeiro a classe COMENTARIO  em C para dar FOR EACH logo,
		 * Lê-se: PARA CADA COMENTARIO C na lista comentarios
		 */
		for(Comentario c: comentarios) {
			sb.append(c.getTexto()+ "\n");
		}
		return sb.toString();
	}
	

}
