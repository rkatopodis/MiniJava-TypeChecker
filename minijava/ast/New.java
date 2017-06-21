package minijava.ast;

public class New implements Exp {
	public String classe;
	public int lin;
	
	public New(String _classe, int _lin) {
		classe = _classe;
		lin = _lin;
	}

	public String toString() {
		return "new " + classe + "()";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
