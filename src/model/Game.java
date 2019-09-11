package model;

import java.util.ArrayList;

/**
 * @author Thalles
 *
 */
/**
 * @author adm
 *
 */
public class Game {
	private int id;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	private int totalMortes;
	private ArrayList<TipoMorte> tipoMortes = new ArrayList<>();
	
	

	/**
	 * @author adm
	 * Função que recebe como argumento uma linha do arquivo e 
	 * popula os jogadores e mortes do jogo ao achar string kill 
	 */
	public String popularDadosRelatorio(String nextLine) {
		int indice;
		// TODO Auto-generated method stub
		if (nextLine.contains("Kill")) {
			
			int KilledbyIndice = nextLine.length() - nextLine.indexOf("by") + 1; //Indice final da string do tipo de morte 
			String nomeJogadorMatou = nextLine.substring(nextLine.lastIndexOf(":") + 2, nextLine.indexOf("killed") - 1); 
			String nomeJogadorMorto = nextLine.substring(nextLine.indexOf("killed") + 6, nextLine.indexOf("by") - 1);
			String killedBy = nextLine.substring(nextLine.indexOf("by") + 3, nextLine.indexOf("by") + KilledbyIndice -1 );
			TipoMorte tipoMorte = new TipoMorte();
			tipoMorte.setNome(killedBy);
			if((indice = tipoMortes.indexOf(tipoMorte)) != -1){
				tipoMortes.get(indice).setQuantidade(tipoMortes.get(indice).getQuantidade()+1);
			}
			if((indice = tipoMortes.indexOf(tipoMorte)) == -1){
				tipoMorte.setQuantidade(1);
				tipoMortes.add(tipoMorte);
				
			}
			
			Jogador jogadorMorto = new Jogador();
			jogadorMorto.setNome(nomeJogadorMorto.trim());
			if (nomeJogadorMatou.equals("<world>")) {
				if ((indice = jogadores.indexOf(jogadorMorto)) != -1) {
					jogadores.get(indice).setMortes(jogadores.get(indice).getMortes() - 1);
				} else {
					jogadorMorto.setMortes(jogadorMorto.getMortes() - 1);
					jogadores.add(jogadorMorto);	
				}
			} else {
				if ((indice = jogadores.indexOf(jogadorMorto)) == -1) {
					jogadores.add(jogadorMorto);
				}
			}

			if (!nomeJogadorMatou.equals("<world>")) {
				Jogador jogadorMatou = new Jogador();
				jogadorMatou.setNome(nomeJogadorMatou.trim());
				if ((indice = jogadores.indexOf(jogadorMatou)) != -1) {
					jogadores.get(indice).setMortes(jogadores.get(indice).getMortes() + 1);
				} else {
					jogadorMatou.setMortes(jogadorMatou.getMortes() + 1);
					jogadores.add(jogadorMatou);
				}
			}
			totalMortes++;
		}
		return totalMortes + jogadores.toString()+tipoMortes.toString();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public int getTotalMortes() {
		return totalMortes;
	}

	public void setTotalMortes(int totalMortes) {
		this.totalMortes = totalMortes;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Game game = (Game) obj;
		if (game.jogadores.size() == jogadores.size() && game.totalMortes == totalMortes) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return  "Total Kills:"+this.totalMortes+ this.getJogadores().toString();
	}

	public ArrayList<TipoMorte> getTipoMortes() {
		return tipoMortes;
	}

	public void setTipoMortes(ArrayList<TipoMorte> tipoMortes) {
		this.tipoMortes = tipoMortes;
	}
}
