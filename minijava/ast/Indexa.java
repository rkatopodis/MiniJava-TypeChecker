package minijava.ast;

public class Indexa implements Exp {
	public Exp vet;
	public Exp ind;
	public int lin;
	
	public Indexa(Exp _vet, Exp _ind, int _lin) {
		vet = _vet;
		ind = _ind;
		lin = _lin;
	}
	
	public String toString() {
		return vet + "[" + ind + "]";
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
