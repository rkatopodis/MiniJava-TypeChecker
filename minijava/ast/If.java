package minijava.ast;

public class If implements Cmd {
	public Exp cond;
	public Cmd cthen;
	public Cmd celse;
	public int lin;
	
	public If(Exp _cond, Cmd _cthen, Cmd _celse, int _lin) {
		cond = _cond;
		cthen = _cthen;
		celse = _celse;
		lin = _lin;
	}

	public If(Exp _cond, Cmd _cthen, int _lin) {
		cond = _cond;
		cthen = _cthen;
		celse = null;
		lin = _lin;
	}

	public String toString() {
		return "if(" + cond + ") " + cthen +
				(celse == null? "" : " else " + celse);
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
