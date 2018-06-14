
public class driver {

	public static void main(String[] args) {
		WordGenerator subjectNode = new subject();
		WordGenerator verbNode = new verb();
		WordGenerator objectNode = new object(); 
		WordGenerator adverbNode = new adverb();
		
		subjectNode.setNext(verbNode);
		verbNode.setNext(objectNode);
		objectNode.setNext(adverbNode);
		
		SentenceGenerator s = new SentenceGenerator(subjectNode, 4);
		s.generateSentence();
		System.out.println(s.getSentence().msg);
		
		System.out.println("");
		SentenceGeneratorTwo generator = new SentenceGeneratorTwo();
		System.out.println(generator.createSentence(new visitorPattern()));
		
	}

}
