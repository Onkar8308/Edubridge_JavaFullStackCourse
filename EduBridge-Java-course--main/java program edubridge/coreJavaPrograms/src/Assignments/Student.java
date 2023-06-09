package Assignments;

import java.util.ArrayList;
import java.util.List;

class Insect	 {
	
	private String insectName;
	private int insectWeight;
	
	
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	
	
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
	
	
}


class Insecicides{
	
	
	public List<String> mapInsecticides(List<Insect> list) {
	List<String>  lst = new ArrayList<>();
		for(Insect insect :list) {
			lst.add(insect.getInsectName());
		}
	return lst;	// TODO Auto-generated method stub
		
	}

	public List<Insect> getWeight(List<Insect> list) {
		List<Insect> filteredList = new ArrayList<>();
		for(Insect in:list) {
			if(in.getInsectWeight()>40 && in.getInsectWeight()<=100)
			filteredList.add(new Insect(in.getInsectName(), in.getInsectWeight()));
		}
		// TODO Auto-generated method stub
		return filteredList;
	}
	
}

public class Student {
	public static void main(String[] args) {
		
		List<Insect> list = new ArrayList<>();
		list.add(new Insect("Ant", 45));
		list.add(new Insect("Cockroch", 65));
		list.add(new Insect("bee", 99));
		list.add(new Insect("paper wasp", 11));
		
		Insecicides i = new Insecicides();
		System.out.println(i.mapInsecticides(list));
		System.out.println(i.getWeight(list));
		
	}

}


