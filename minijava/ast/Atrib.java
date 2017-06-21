package minijava.ast;

public class Atrib implements Cmd {
	public String nome;
	public Exp exp;
	public int lin;
	
	public Atrib(String _nome, Exp _exp, int _lin) {
		nome = _nome;
		exp = _exp;
		lin = _lin;
	}

	public String toString() {
		return nome + " = " + exp + ";";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
