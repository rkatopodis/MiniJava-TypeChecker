package minijava.ast;

public class Null implements Exp{
	public String toString() {
		return "null";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
