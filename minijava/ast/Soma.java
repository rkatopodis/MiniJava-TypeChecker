package minijava.ast;

public class Soma implements Exp {
	public Exp e1;
	public Exp e2;
	public int lin;
	
	public Soma(Exp _e1, Exp _e2, int _lin) {
		e1 = _e1;
		e2 = _e2;
		lin = _lin;
	}
	
	public String toString() {
		return "(" + e1 + " + " + e2 + ")";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
