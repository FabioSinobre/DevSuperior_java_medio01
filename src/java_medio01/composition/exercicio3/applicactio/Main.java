package java_medio01.composition.exercicio3.applicactio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Scanner;

import java_medio01.composition.exercicio3.entities.Comment;
import java_medio01.composition.exercicio3.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		//Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comment1 = new Comment("Uau que lugar maravilhoso!!!");
		Comment comment2 = new Comment("sim, muito bonito mesmo!");
		
		Post post1 = new Post(sdf.parse("21/06/2022 09:08:55"), "Visita a Nova Zelandia", "Lugar muito maravilhoso!", 15 );
		post1.addComment(comment1);
		post1.addComment(comment2);
		System.out.println(post1);
		
		System.out.println("---------------------------------------------------------------------");
		Comment comment3 = new Comment("adorei o seu TCC!!!");
		Comment comment4 = new Comment("Estou iniciando a minha pesqueisa você pode me ajudar com o relatório escrito!");
		
		Post post2 = new Post(sdf.parse("11/07/2022 06:08:55"), "Fim do TCC ", "Todos os anos na facu é assustador mas nada se compara ao TCC", 115 );
		post2.addComment(comment3);
		post2.addComment(comment4);
		System.out.println(post2);
		//scan.close();
	}

}
