package minijava.ast;

public class AtribVetor implements Cmd {
	public String nome;
	public Exp ind;
	public Exp rval;
	public int lin;
	
	public AtribVetor(String _nome, Exp _ind, Exp _rval, int _lin) {
		nome = _nome;
		ind = _ind;
		rval = _rval;
		lin = _lin;
	}

	public String toString() {
		return nome + "[" + ind + "]" + " = " + rval + ";";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
