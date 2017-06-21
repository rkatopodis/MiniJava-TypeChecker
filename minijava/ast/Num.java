package minijava.ast;

public class Num implements Exp {
	public int val;
	
	public Num(String lexeme) {
		val = Integer.parseInt(lexeme);
	}

	public String toString() {
		return "" + val;
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}

