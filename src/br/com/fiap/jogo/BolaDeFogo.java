package br.com.fiap.jogo;

public class BolaDeFogo implements Mover {
	
	private int poder = 10;
    private int x;
    private int y;

    public BolaDeFogo(int x, int y) {
        this.x = x;
        this.y = y;
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

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	
}
