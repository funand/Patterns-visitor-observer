public class visitorPattern implements visitor {
	String statement ="";
	@Override
	public void visit(subjetTwo s) {
		statement += s.word();
	}

	@Override
	public void visit(verbTwo v) {
		statement += v.word();
	}

	@Override
	public void visit(objectTwo o) {
		statement += o.word();
	}

	@Override
	public void visit(adverbTwo a) {
		statement += a.word();
	}
	public String getSentence(){return statement;}
}

interface visitor{
	void visit(subjetTwo s);
	void visit(verbTwo v);
	void visit(objectTwo o);
	void visit(adverbTwo a);
	String getSentence();
}
