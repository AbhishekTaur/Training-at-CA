package wstest;

public class Solution {

	public static void main(String[] args) {
		Hello d =new Hello();
		MathService port = d.getMathServicePort();
		int x = port.subtractNumbers(23, 34);
		System.out.println(x);

	}

}
