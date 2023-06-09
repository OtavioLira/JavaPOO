package tokio.aulas.aula06;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario {
	
	//Atributos
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	List<Usuario> list = new ArrayList<Usuario>();	
	
	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while(iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if(usuario.getNome() == nome) {
				iterator.remove();
			}
		}
		return list;
	}
	
	//Construtor
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static void main(String args[]) {
		
		Usuario usuarios[] = new Usuario[2];
		usuarios[0] = new Usuario("Jose", "root");
		usuarios[1] = new Usuario("Maria", "root");
		
		for(Usuario usuario: usuarios) {
			System.out.println("Nome do usuario: " + usuario.getNome());
			System.out.println("Data de cadastro: " + usuario.getDataCadastro());
		}
		
		
	}

}
