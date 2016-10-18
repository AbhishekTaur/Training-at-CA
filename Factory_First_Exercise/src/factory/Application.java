package factory;

public class Application {

	public static void main(String[] args) {
		Country c = CountryFactory.getCountry("Russia");
		System.out.println(c.getCurrency());
		System.out.println(c.getLanguage());
	}

}
