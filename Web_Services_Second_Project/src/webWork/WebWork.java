package webWork;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName="hello")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL ,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public class WebWork {
	@WebMethod
	@WebResult(name = "sum")
	public int highest(@WebParam(name = "number1") int x, @WebParam(name = "number2") int y) {

		return x>y?x:y;
	}
	
	@WebMethod
	@WebResult(name = "to_upper")
	public String toUpper(@WebParam(name = "String_s") String s){
		String k=s.toUpperCase();
		return k;
	}
	
	@WebMethod
	@WebResult(name = "concatenate")
	public String mixup(@WebParam(name = "String_s1")String s1,@WebParam(name = "String_s2")String s2){
		return s1+s2;
	}

}
