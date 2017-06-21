package minijava.ast;

public class Var {
	public String tipo;
	public String nome;
	public int lin;
	
	public Var(String _tipo, String _nome, int _lin) {
		tipo = _tipo;
		nome = _nome;
		lin = _lin;
	}

	public String toString() {
		return tipo + " " + nome;
	}
}
