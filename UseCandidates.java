package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCandidates {
	public static void main(String []   args) {
	ArrayList<Candidates>candidate=new ArrayList<>();
	candidate.add(new Candidates("gokul","be",123,"Male"));
	candidate.add(new Candidates("kannan","be",124,"Male"));
	candidate.add(new Candidates("swathi","be",125,"feMale"));
	candidate.add(new Candidates("rekha","be",126,"feMale"));
	candidate.add(new Candidates("gowri","be",127,"feMale"));
	candidate.add(new Candidates("RAJU","be",128,"Male"));
	candidate.add(new Candidates("keerthi","be",143,"feMale"));
	candidate.add(new Candidates("malavika","be",176,"feMale"));
	candidate.add(new Candidates("ranga","be",190,"Male"));
	
	List<String>c=candidate.stream().filter(x->x.getGender()=="feMale").map(b->b.getName()).collect(Collectors.toList());
	c.forEach(a->System.out.println(a));
	Map<Integer,Candidates>m=candidate.stream().filter(y->y.getGender().equalsIgnoreCase("male")).collect(Collectors.toMap(v->v.getId(),j->j));
	for(Integer k:m.keySet()) {
		System.out.println(m.get(k).getName());
		
	}
	m.keySet().forEach(r->System.out.println(m.get(r).getName()));

}
}
	