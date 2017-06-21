package minijava.ast;

public interface Visitor<C, R> {
	R visit(Atrib no, C ctx);
	R visit(AtribVetor no, C ctx);
	R visit(Bloco no, C ctx);
	R visit(Campo no, C ctx);
	R visit(Chamada no, C ctx);
	R visit(Classe no, C ctx);
	R visit(Dif no, C ctx);
	R visit(Div no, C ctx);
	R visit(ELog no, C ctx);
	R visit(False no, C ctx);
	R visit(Id no, C ctx);
	R visit(If no, C ctx);
	R visit(Igual no, C ctx);
	R visit(Indexa no, C ctx);
	R visit(Length no, C ctx);
	R visit(Menor no, C ctx);
	R visit(Metodo no, C ctx);
	R visit(Mult no, C ctx);
	R visit(Nao no, C ctx);
	R visit(Neg no, C ctx);
	R visit(New no, C ctx);
	R visit(Null no, C ctx);
	R visit(Num no, C ctx);
	R visit(Println no, C ctx);
	R visit(Prog no, C ctx);
	R visit(Soma no, C ctx);
	R visit(Sub no, C ctx);
	R visit(This no, C ctx);
	R visit(True no, C ctx);
	R visit(Vetor no, C ctx);
	R visit(While no, C ctx);
}
