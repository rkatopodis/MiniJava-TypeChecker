package minijava.ast;

public interface Cmd {
	<C, R> R accept(Visitor<C, R> vis, C ctx);
}
