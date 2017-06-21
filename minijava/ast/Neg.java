package minijava.ast;

public class Neg implements Exp {
	public Exp e;
	public int lin;
	
	public Neg(Exp _e, int _lin) {
		e = _e;
		lin = _lin;
	}
	
	public String toString() {
		return "(-" + e + ")";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
