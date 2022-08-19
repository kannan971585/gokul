package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		
		ArrayList <Employee>employees=new ArrayList<>();
		employees.add(new Employee("gokul",24,1103,200000));
		employees.add(new Employee("ranga",25,1104,300000));
		employees.add(new Employee("rajesh",26,1105,400000));
		employees.add(new Employee("gokul",28,1106,500000));
		employees.add(new Employee("kannan",29,1107,100000));
		employees.add(new Employee("rahul",22,1108,50000));
		List<Employee>e=employees.stream().filter(x->x.getSalary()>10000&&x.getSalary()<500000).collect(Collectors.toList());
		e.forEach(c->System.out.println(c));
		for(Employee a:employees) {
			if(a.getSalary()>20000&&a.getSalary()<500000) {
				System.out.println(a);
			}
		}
		long l=employees.stream().filter(x->x.getSalary()>10000&&x.getSalary()<500000).map(b->b.getName()).count();
		System.out.println(l);
		
	}

}
