import java.util.ArrayList;

public class SentenceGeneratorTwo {
	ArrayList<WordGeneratorTwo> words;
	
	public SentenceGeneratorTwo() {
		words = new ArrayList<WordGeneratorTwo>();
		words.add(new subjetTwo());
		words.add(new verbTwo());
		words.add(new objectTwo());
		words.add(new adverbTwo());
	}
	
	public String createSentence(visitor v){
		for (int i = 0; i< words.size(); i++){
			words.get(i).processRequest(v);
		}
		return v.getSentence();
	}
}
