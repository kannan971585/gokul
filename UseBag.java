package day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseBag {
   public static void main(String[] args) {
	Bag bag1=new Bag("fastrag",400,3,true);
	Bag bag2=new Bag("terry",900,3,true);
	Bag bag3=new Bag("swis",500,2,false);
	Bag bag4=new Bag("fastrag2",300,3,false);
	Bag bag5=new Bag("fastrag3",400,3,true);
	Bag bag6=new Bag("fastrag4",400,3,false);
	
	ArrayList<Bag>b=new ArrayList<>();
	b.add(bag1);
	b.add(bag2);
	b.add(bag3);
	b.add(bag4);
	b.add(bag5);
	b.add(bag6);
	List<String> m=b.stream().filter(x->x.getBrand().equalsIgnoreCase("O")).map(y->y.getBrand()).collect(Collectors.toList());
	
	/*Map<String,Bag>w=b.stream().collect(Collectors.toMap(i->i.getBrand(),j->j));*/
	
	
	
	
    
}

private static Object Collectors() {
	// TODO Auto-generated method stub
	return null;
}
}
