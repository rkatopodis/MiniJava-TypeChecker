package minijava.ast;

public interface Exp {
	<C, R> R accept(Visitor<C, R> vis, C ctx);
}
