package minijava.ast;

import java.util.List;

public class Bloco implements Cmd {
	public List<Cmd> cmds;
	
	public Bloco(List<Cmd> _cmds) {
		cmds = _cmds;
	}

	public String toString() {
		String res = "{\n ";
		for(Cmd cmd: cmds) {
			res += cmd + "\n";
		}
		res += "}";
		return res;
	}

	@Override
	public <C, R> R accept(Visitor<C, R> vis, C ctx) {
		return vis.visit(this, ctx);
	}
}
