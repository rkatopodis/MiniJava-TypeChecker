package minijava.ast;

public class Length implements Exp {
	public Exp exp;
	public int lin;
	
	public Length(Exp _exp, int _lin) {
		exp = _exp;
		lin = _lin;
	}

	public String toString() {
		return exp + ".length";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
