package minijava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import minijava.ast.Prog;
import minijava.ast.TypeVisitor;

public class Driver {
	public static Prog parse(String fname) throws IOException {
		File f = new File(fname);
		FileReader fr = new FileReader(f);
		Parser parser = new Parser(fr);
		parser.parse();
		TypeVisitor tv = new TypeVisitor();
		parser.saida.accept(tv, null);
		for(String err: tv.erros) {
			System.err.println(err);
		}
		return parser.saida;
	}
		
	public static void main(String[] args) throws IOException {
		System.out.println(parse(args[0]).toString());
	}
}
