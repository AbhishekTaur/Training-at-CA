package wstest2;

public class Solution {

	public static void main(String[] args) {
		Welcome w = new Welcome();
		StringMathWebService port = w.getStringMathWebServicePort();
		System.out.println(port.concatString("Hello"," World!"));
	}

}
