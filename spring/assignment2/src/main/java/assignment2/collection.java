package assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {
	
	private List<question> QuestionList;
	private Set<question> QuestionSet;
	private Map<Integer,question> QuestionMap;
	
	

	public Map<Integer, question> getQuestionMap() {
		System.out.println("Map Elements :"  + QuestionMap);
		return QuestionMap;
	}

	public void setQuestionMap(Map<Integer, question> questionMap) {
		QuestionMap = questionMap;
	}

	public Set<question> getQuestionSet() {
		System.out.println("Set Elements :"  + QuestionSet);
		return QuestionSet;
	}

	public void setQuestionSet(Set<question> questionSet) {
		QuestionSet = questionSet;
	}

	public List<question> getQuestionList() {
		System.out.println("List Elements :"  + QuestionList);
		return QuestionList;
	}

	public void setQuestionList(List<question> questionList) {
		QuestionList = questionList;
	}
	
	public void showList() {
		for(question q:QuestionList)
			System.out.println("Question- "+q.getQuestion()+" Answer- "+q.getAnswer());	
	}
	
	public void showSet() {
		for(question q:QuestionSet)
			System.out.println("Question- "+q.getQuestion()+" Answer- "+q.getAnswer());	
	}
	
	public void showMap() {
		for (Integer i : QuestionMap.keySet()) {
			  System.out.println("key: " + i + " Question- " + QuestionMap.get(i).getQuestion()+" Answer- "+QuestionMap.get(i).getAnswer());
		}
	}

}