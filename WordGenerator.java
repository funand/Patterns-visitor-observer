import java.util.ArrayList;

public abstract class WordGenerator {
	private WordGenerator next;	
	abstract Sentence processRequest(Sentence s);
	
	public WordGenerator() {
		next = null;
	}
	
	public WordGenerator getNext() {
		return next;
	}
	public void setNext(WordGenerator next) {
		this.next = next;
	}
	
}

class subject extends WordGenerator{
	ArrayList<String> word;
	
	public subject() {
		word = new ArrayList<String>();
		word.add("King ");
		word.add("A cat ");
		word.add("The boy ");
	}
	
	@Override
	public Sentence processRequest(Sentence s) {
		Sentence  temp = s;
		int i = (int)  (Math.random() *3);
		temp.setSentence(word.get(i));
		return temp;
	}
	
}

class verb extends WordGenerator{
	ArrayList<String> word;
	
	public verb() {
		word = new ArrayList<String>();
		word.add("run ");
		word.add("jump ");
		word.add("fly ");
	}
	
	@Override
	public Sentence processRequest(Sentence s) {
		Sentence  temp = s;
		int i = (int)  (Math.random() *3);
		temp.setSentence(word.get(i));
		return temp;
	}
	
}
class object extends WordGenerator{
	ArrayList<String> word;
	
	public object() {
		word = new ArrayList<String>();
		word.add("a box ");
		word.add("a car ");
		word.add("a house ");
	}
	
	@Override
	public Sentence processRequest(Sentence s) {
		Sentence  temp = s;
		int i = (int)  (Math.random() *3);
		temp.setSentence(word.get(i));
		return temp;
	}
	
}

class adverb extends WordGenerator{
	ArrayList<String> word;
	
	public adverb() {
		word = new ArrayList<String>();
		word.add("delicately.");
		word.add("abruptly.");
		word.add("quickly.");
	}
	
	@Override
	public Sentence processRequest(Sentence s) {
		Sentence  temp = s;
		int i = (int)  (Math.random() *3);
		temp.setSentence(word.get(i));
		return temp;
	}
	
}

class Sentence{
	String msg = "";
	public void setSentence(String s){
		this.msg += s;
	}
}