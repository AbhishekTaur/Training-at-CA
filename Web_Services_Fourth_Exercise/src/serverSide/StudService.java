package serverSide;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://StudentService.example", name="StudService")
public interface StudService {
	@WebMethod(operationName="Stud",action="urn:getStudent")
	@WebResult(name="EmpData")
	public Student getStudent(@WebParam(name="studentID")int studentID);
	
	@WebMethod(operationName="Blood",action="urn:setStudent")
	@WebResult(name="truth")
	public boolean setStudent(@WebParam(name="student")Student s);

}
