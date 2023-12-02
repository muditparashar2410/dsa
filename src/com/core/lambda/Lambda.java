package com.core.lambda;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {

	public static void main(String[] args) {

		 Runnable r = () -> System.out.println("mudit");
		 r.run();
		 
//		 Predicate<String> p = s -> s.length()>10;
//		 System.out.println(p.test("Mudit Parashar"));
		 
//		 Function<String,Integer> func = s -> s.length() ;
//		 System.out.println(func.apply("mudit parashar"));
		 
//		 Consumer<String> con = n-> System.out.println(n);
//		 con.accept("mud");
		
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get());
		
		
		
		
		
		
	}

}
