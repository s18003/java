import java.util.*;

public class En4_2 {
		public static void main(String[] args){
			PrimeNumberCalcultor calc = new PrimeNumberCalcultor();
			printNumbers(calc.calcTo(100));
		}
		 
		private static void printNumbers(List<Integer> numbers){
			for (int number: numbers){
				System.out.println(number);
			}
		}
}
