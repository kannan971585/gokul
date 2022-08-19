package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Marker {
	public static void main(String[] args) {
		ArrayList<Integer>m=new ArrayList<>();
		m.add(10);
		m.add(20);
		m.add(40);
		m.add(33);
		
		List<Integer>a=m.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(a);
	}

}
