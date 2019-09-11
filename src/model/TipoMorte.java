package model;

public class TipoMorte {
	private String nome;
	private int quantidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		TipoMorte tipoMorte  = (TipoMorte) obj;
		if(tipoMorte.nome.equals(nome)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+": "+quantidade;
	}
}
