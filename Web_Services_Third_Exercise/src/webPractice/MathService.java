package webPractice;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName="hello")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL ,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

public class MathService {
	@WebMethod
	@WebResult(name = "sum")
	public int addNumbers(@WebParam(name = "number1") int x, @WebParam(name = "number2") int y) {

		return x + y;
	}

	public int subtractNumbers(int x, int y) {
		return x - y;
	}
}
