package exam12017;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class test {
	/*
	 * this is the test code for class ese
	 */


	public static void main(String[] args) {
		/*
		 * read the file as string
		 */
		
		
		/*
		 * convert the string input to ascII decimal
		 */
		String input = "In 1853, prominent St. Louis merchant Wayman Crow and his pastor, William Greenleaf Eliot Jr., concerned about the lack of institutions of higher learning in the growing midwest, led the founding of Washington University in St. Louis. During the 1840s and 50s, waves of immigrants flooded into St. Louis, boosting the population of the young city. With these newcomers came a pressing need for education - both industrial training and basic general courses - conducted outside of normal working hours. So the first educational step of the young Washington University was to establish an evening program on October 22, 1854. Over the succeeding decades, the continuing education program underwent many changes. The university flourished at its location in downtown St. Louis for its first 50 years, growing from an evening program to an institution offering a full slate of scientific, liberal arts and classical course offerings. In time, schools of law and fine arts were added. In 1891, the school acquired the St. Louis Medical College to form a medical department, which merged with the Missouri Medical College in 1899.";
		char[] input2 = input.toCharArray();
		String[] letter = input.split("\\a");
		for (int i = 0; i < input2.length; i++) {
			System.out.println((int) input2[i]);
		}
		
	}

}
