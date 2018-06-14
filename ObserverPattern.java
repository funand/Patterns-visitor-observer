import java.util.ArrayList;

public class ObserverPattern {
	public static void main(String[] args) {
		itDepartment department = new itDepartment();
		
		department.add(new developers("dev"));
		department.add(new businessAnalysts("ba"));
		department.add(new teamLeads("tl"));
		department.add(new testers("tt"));	
		
		department.informListeners("dev", "Check it");
		department.informListeners("tt", "test it");
		System.out.println("All:");
		department.informListeners("all", "do it");

	}
}

class itDepartment{
	private ArrayList<IObserver> observerList;
	
	public itDepartment() {
		observerList = new ArrayList<IObserver>();
	}
	public void add(IObserver observer) {
		observerList.add(observer);
	}
	public void remove(IObserver observer) {
		observerList.remove(observer);
	}	
	
	public void informListeners(String id, String msg) {
		for (IObserver item: observerList) {
			item.observe(id, msg);
		}
	}		
} 

abstract class IObserver {
	String id;
	public IObserver(String identifier) {
		this.id = identifier;
	}
	abstract void observe(String id, String msg);
}

class developers extends IObserver{	
	public developers(String identifier) {
		super(identifier);
	}

	@Override
	void observe(String id, String msg) {
		if(this.id.equalsIgnoreCase(id) || id.equalsIgnoreCase("all") ){
			System.out.println(this.id + ": Developer observed: "+ msg);
		}
	}	
}

class businessAnalysts extends IObserver{
	public businessAnalysts(String identifier) {
		super(identifier);
	}

	@Override
	void observe(String id, String msg) {
		if(this.id.equalsIgnoreCase(id) || id.equalsIgnoreCase("all") ){
			System.out.println(this.id + ": Business analysts observed: "+ msg);
		}
		
	}	
}

class teamLeads extends IObserver{
	public teamLeads(String identifier) {
		super(identifier);
	}

	@Override
	void observe(String id, String msg) {
		if(this.id.equalsIgnoreCase(id) || id.equalsIgnoreCase("all") ){
			System.out.println(this.id + ": Team Leads observed: "+ msg);
		}		
	}
}

class testers extends IObserver{
	
	public testers(String identifier) {
		super(identifier);
	}

	@Override
	void observe(String id, String msg) {
		if(this.id.equalsIgnoreCase(id) || id.equalsIgnoreCase("all") ){
			System.out.println(this.id + ": Testers observed: "+ msg);
		}		
	}
}