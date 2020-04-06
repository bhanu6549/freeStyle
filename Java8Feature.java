import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Feature {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,9,4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//map
		System.out.println("map");
		Stream<Integer> s=list.stream();
		Stream<Double> m=s.map(x->Math.sqrt(x));
		m.forEach(t->System.out.println(t));
		//reduce
		System.out.println("reduce");
		Stream<Integer> s1=list.stream();
		int r=s1.reduce(0, ((a,b)->a+b));
		System.out.println(r);
		//filter
		System.out.println("filter");
		Stream<Integer> s2=list.stream();
		Stream<Integer> f= s2.filter(x ->x>4);
		f.forEach(t->System.out.println(t));
		
	}
}
