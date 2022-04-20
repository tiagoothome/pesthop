package petshop.model;

public class Veterinario {
	private int id;
	private String nome;
	private String crmv;
	private String especialidade;
	
	public Veterinario() {
		
	}
	public Veterinario(int id, String nome, String crmv, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.crmv = crmv;
		this.especialidade = especialidade;
	}
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
	public String getCrmv() {
		return crmv;
	}
	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
