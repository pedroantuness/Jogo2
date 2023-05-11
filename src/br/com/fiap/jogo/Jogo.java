package br.com.fiap.jogo;

public class Jogo {

	public static void main(String[] args) {
		var guerreiro = new Guerreiro("guerreiro", false, 0, 0);
		var mago = new Mago("mago", false, 100, 0, 0);
	
		
		mostrarJogador(guerreiro);
		guerreiro.receberDano(10);
		mostrarJogador(guerreiro);
		guerreiro.receberCura(5);
		mostrarJogador(guerreiro);
		guerreiro.ganharExperiencia(20);
		mostrarJogador(guerreiro);
		guerreiro.receberAntidoto();
		mostrarJogador(guerreiro);
		mago.atacar(guerreiro);
		mostrarJogador(guerreiro);
		
		System.out.println("Jogador 2 " + mago.getNome() + 
							" XP=" + mago.getXp() +
							" HP=" + mago.getHp() +
							" Env=" + mago.isEnvenenado() +
							" Mana=" + mago.getMp()
			);
	}

	private static void mostrarJogador(Jogador guerreiro) {
		System.out.println("Jogador 1 " + guerreiro.getNome() + 
							" XP=" + guerreiro.getXp() +
							" HP=" + guerreiro.getHp() +
							" Env=" + guerreiro.isEnvenenado()
						);
	}
	
}
