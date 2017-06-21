package minijava.ast;

public class False implements Exp {
	public String toString() {
		return "false";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
