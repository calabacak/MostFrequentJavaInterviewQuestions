 package Most_Frequent_Coding_Questions;

public class MF_07_Factorial {

	public static int findFaktoriel(int num) {

		int faktoriel = 1;
		for (int i = num; i >= 1; i--) {

			faktoriel = faktoriel * i;
		}
		return faktoriel;
	}

	public static int wfindFaktoriel(int num) {

		int faktoriel = 1;
		while (num > 0) {

			faktoriel = faktoriel * num;

			num--;
		}
		return faktoriel;
	}
	
	public static int findFakt(int a) {
		int faktorial=1;
		for(int i=1;i<=a;i++) {
			faktorial=faktorial*i;
			
		}
		return faktorial;
	}

	public static void main(String[] args) {
		System.out.println(findFaktoriel(5));
		System.out.println(wfindFaktoriel(6));
		System.out.println(findFakt( 4));
	}

}
