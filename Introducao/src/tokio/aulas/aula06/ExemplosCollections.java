package tokio.aulas.aula06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemplosCollections {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("João");
		lista.add("Maria");
		lista.add("Marcos");
		lista.add("Anna");
		lista.add("Jose");
		lista.add("Pedro");
		
		List<Usuario> list = new ArrayList<Usuario>();
		Usuario jose = new Usuario("Jose", "123");
		Usuario maria = new Usuario("Maria", "123");
		Usuario pedro = new Usuario("Pedro", "123");
		list.add(jose);
		list.add(maria);
		list.add(pedro);
		
		
		for(Usuario usuario: list) {
			System.out.println("Nome do Usuario: " + usuario.getNome());
			System.out.println("Senha do Usuario: " + usuario.getSenha());
		}
		//<Usuario> teste = list
		
		
//		for(Usuario usuarios: teste) {
//			System.out.println(usuarios.getNome());
//		}
//		
	}
	

}
