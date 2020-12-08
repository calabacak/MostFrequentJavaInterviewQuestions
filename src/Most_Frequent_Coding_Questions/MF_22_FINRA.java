package Most_Frequent_Coding_Questions;

import java.util.Arrays;

public class MF_22_FINRA {

	public static void main(String[] args) {

		String[] result = new String[30];
		for (int i = 0; i <= 29; i++)
			result[i] = "" + (i + 1);
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < 30; i++) {
			if (Integer.parseInt("" + (i + 1)) % 15 == 0)
				result[i] = "FINRA";
			else if (Integer.parseInt("" + (i + 1)) % 5 == 0)
				result[i] = "RA";
			else if (Integer.parseInt("" + (i + 1)) % 3 == 0)
				result[i] = "FIN";
		}

		System.out.println(Arrays.toString(result));
	}

	public static void returnFinra() {
		String[] result = new String[30];
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			// result[i]=i+1+"";
			result[i] = String.valueOf(i + 1);
		}
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			if (Integer.parseInt(result[i]) % 15 == 0) {
				result[i] = "FINRA";
			} else if (Integer.parseInt(result[i]) % 5 == 0) {
				result[i] = "RA";
			} else if (Integer.parseInt(result[i]) % 3 == 0) {
				result[i] = "FIN";
			} else {
				result[i] = result[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}

}
