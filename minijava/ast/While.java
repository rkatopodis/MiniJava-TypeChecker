package minijava.ast;

public class While implements Cmd {
	public Exp cond;
	public Cmd corpo;
	public int lin;
	
	public While(Exp _cond, Cmd _corpo, int _lin) {
		cond = _cond;
		corpo = _corpo;
		lin = _lin;
	}

	public String toString() {
		return "while(" + cond + ") " + corpo;
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
