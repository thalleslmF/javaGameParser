package service.game;

public class Jogador {
	private String nome;
	private int mortes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMortes() {
		return mortes;
	}
	public void setMortes(int mortes) {
		this.mortes = mortes;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Jogador jogador  = (Jogador) obj;
		if(jogador.nome.equals(nome)) {
			return true;
		}else {
			return false;
		}
	}
	  @Override
	    public String toString() { 
		  return this.nome+": "+this.mortes ;
	  }
	
}
