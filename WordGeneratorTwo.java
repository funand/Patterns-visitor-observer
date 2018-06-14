import java.util.ArrayList;

public abstract class WordGeneratorTwo {
	private WordGeneratorTwo next;	
	public abstract void processRequest(visitor k);
	
	public WordGeneratorTwo() {
		next = null;
	}
	
	public WordGeneratorTwo getNext() {
		return next;
	}
	public void setNext(WordGeneratorTwo next) {
		this.next = next;
	}	
}

class subjetTwo extends WordGeneratorTwo{
ArrayList<String> word;
	
	public subjetTwo(){
		word = new ArrayList<String>();
		word.add("King ");
		word.add("A cat ");
		word.add("The boy ");
	}	
	
	public void processRequest(visitor s) {
		s.visit(this);
	}
	
	public String word(){
		int i = (int)  (Math.random() *3);
		return word.get(i);
	}
}

class verbTwo extends WordGeneratorTwo{
ArrayList<String> word;
	
	public verbTwo(){
		word = new ArrayList<String>();
		word.add("run ");
		word.add("jump ");
		word.add("fly ");
	}	
	
	public void processRequest(visitor s) {
		s.visit(this);
	}
	
	public String word(){
		int i = (int)  (Math.random() *3);
		return word.get(i);
	}
}

class objectTwo extends WordGeneratorTwo{
ArrayList<String> word;
	
	public objectTwo(){
		word = new ArrayList<String>();
		word.add("a box ");
		word.add("a car ");
		word.add("a house ");
	}	
	
	public void processRequest(visitor s) {
		s.visit(this);
	}
	
	public String word(){
		int i = (int)  (Math.random() *3);
		return word.get(i);
	}
}

class adverbTwo extends WordGeneratorTwo{
ArrayList<String> word;
	
	public adverbTwo(){
		word = new ArrayList<String>();
		word.add("delicately.");
		word.add("abruptly.");
		word.add("quickly.");
	}	
	
	public void processRequest(visitor s) {
		s.visit(this);
	}
	
	public String word(){
		int i = (int)  (Math.random() *3);
		return word.get(i);
	}
}