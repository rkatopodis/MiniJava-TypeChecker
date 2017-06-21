package minijava.ast;

public class True implements Exp{
	public String toString() {
		return "true";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
