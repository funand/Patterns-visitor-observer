public class SentenceGenerator {
	WordGenerator head;
	int size;
	Sentence task;
	
	public SentenceGenerator(WordGenerator h, int numNodes){
		head = h;
		size = numNodes;
		task = new Sentence();
	}
	
	public void add(WordGenerator node, int pos){
		if(head == null){
			head = node;
		}
		else{
			//to be done
		}
		size++;	
	}
	
	public void generateSentence(){
		WordGenerator cursor = head;
		while (cursor != null){
			task = cursor.processRequest(task);
			cursor = cursor.getNext();
		}
	}
	
	public Sentence getSentence(){return task;}
}
