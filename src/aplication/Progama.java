package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Postagem;

public class Progama {

	public static void main(String[] args) throws ParseException {
		/*OBSERVAÇÃO 01 
		 *Sempre que trabalhar com data, a primeira coisa a ser feita no inicio da classe é declarar o SIMPLE DATE FORMAT*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Isso é maravilhoso");
		
		/*OBSERVAÇÃO 02
		 * Ao passar os argumentos de data no construtor, preciso fazer o PARSE 
		 */
		Postagem p1 = new Postagem(sdf.parse("21/05/2020 13:05:44"), "Viajando para Acapulco", "Indo visitar o hotel do Chaves", 12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
				
	}

}
