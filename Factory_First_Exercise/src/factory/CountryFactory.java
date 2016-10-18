package factory;

public class CountryFactory {

	static public Country getCountry(String c){
		if(c == "India"){
			return new India();
		}
		if(c == "USA"){
			return new USA();
		}
		if(c == "France"){
			return new France();
		}
		if(c == "Russia"){
			return new Russia();
		}
		if(c == "Germany"){
			return new Germany();
		}
		return null;
	}
	
	static private class India implements Country{
		public String getCurrency(){
			return "Rupees";
		}
		public String getLanguage(){
			return "Hindi";
		}
	}
	static private class USA implements Country{
		public String getCurrency(){
			return "Dollors";
		}
		public String getLanguage(){
			return "English";
		}
	}
	static private class France implements Country{
		public String getCurrency(){
			return "Euro";
		}
		public String getLanguage(){
			return "French";
		}
	}
	static private class Russia implements Country{
		public String getCurrency(){
			return "Russian ruble";
		}
		public String getLanguage(){
			return "Russian";
		}
	}static private class Germany implements Country{
		public String getCurrency(){
			return "Euro";
		}
		public String getLanguage(){
			return "German";
		}
	}
}
