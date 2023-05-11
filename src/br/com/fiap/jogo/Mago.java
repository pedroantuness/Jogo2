package br.com.fiap.jogo;

public class Mago extends Jogador implements Mover {
	
	private int mp;
	private int x;
	private int y;

	public Mago(String nome, boolean envenenado, int mp, int x, int y) {
		super(nome, envenenado);
		this.mp = mp;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	
	public int getMp() {
		return mp;
	}

}
