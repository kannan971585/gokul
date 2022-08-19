package day21;

import java.util.ArrayList;

public class UseDuster {
	public static void main(String[] args) {
		ArrayList<Duster>d=new ArrayList<>();
		d.add(new Duster(15,"wood",true));
		d.add(new Duster(10,"plastic",true));
		d.add(new Duster(15,"wood",false));
		d.add(new Duster(15,"plastic",true));
		int max=0;
		Duster min=d.get(0);
		ArrayList<Duster>wd=new ArrayList<>();
		for(Duster l:d) {
			if(l.isWhiteBoardDuster()==true) {
				wd.add(l);
			}
			
		}
		wd.forEach(i->System.out.println(i));
		for(Duster e:d) {
			if(e.getPrice()>max) {
				max=e.getPrice();
			}
			
		}
		System.out.println(max);
		for(Duster m:d) {
			if(m.getPrice()<min.getPrice()) {
				min=m;
			}
			
		}
		
		System.out.println(min.getPrice());
		
		
		
		
	}

}
