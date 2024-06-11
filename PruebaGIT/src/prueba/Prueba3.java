package prueba;

import java.util.Arrays;
import java.util.List;

public class Prueba3 {

	public static void main(String[] args) {
	
		List<Integer> lista = Arrays.asList (1,2,3,4,5,6,7,8,9,10);
		
		lista.sort((n1,n2)-> -(n1.compareTo(n2)));
		
		System.out.println("Ordenados de mayor a menor");
		lista.stream().forEach((n)-> System.out.println(n));		
		
		System.out.println("Filtrados los menores que 5 , Ordenados de mayor a menor");
		lista.stream().filter((x)-> x>=5).forEach((n)-> System.out.println(n));
	}	
}
