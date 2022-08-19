package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	static public void main(String[] args) {
		ArrayList<Car>car=new ArrayList<>();
		car.add(new Car("hoda",2000000,"cz9085472",5987));
		car.add(new Car("maruti",500000,"cz9085490",5989));
		car.add(new Car("ertica",1100000,"cz9085477",5987));
		car.add(new Car("hydai",500000,"cz9085465",5988));
		car.add(new Car("benz",3000000,"cz9085432",5981));
		car.add(new Car("lambogini",20000000,"cz9085411",5982));
		//car.forEach(x->System.out.println(x));
		/*car.forEach(y->{
			if(y.getPrice()<700000) {
				System.out.println(y);
			} else {
				System.out.println(y);
			}
		});*/
		List<Car>c=car.stream().filter(x->x.getPrice()>700000).collect(Collectors.toList());
		//car.forEach(v->System.out.println(v));
		Map<String,Car>d=c.stream().filter(x->x.getPrice()>1100000).collect(Collectors.toMap(i->i.getChasisNo(),j->j));
		for(String v:d.keySet()) {
			System.out.println(d.get(v));
		}
		d.keySet().forEach(k->System.out.println(d.get(k)));
		
		
	}

}
