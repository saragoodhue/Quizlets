
public class Quizlet {
	private String term;
	private String definition;
	
	
	public Quizlet(String t, String d) {
		term = t;
		definition = d;
		
	}


	public String getTerm() {
		return term;
	}


	public void setTerm(String term) {
		this.term = term;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}
	

}
