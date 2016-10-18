package rs.calc.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.Response;
 
public class CalculatorClient {
    static final String REST_URI = "http://localhost:9090/Web_Services_Sixth_Exercise/rest";
    static final String ADD_PATH = "calc/add";
    static final String SUB_PATH = "calc/sub";
 
    public static void main(String[] args) {
 
        int a = 122;
        int b = 34;
 
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(REST_URI);
        
        WebTarget addService = target.path(ADD_PATH).path(a+"/"+b);
        
        System.out.println("Add Output as XML: " + getOutputAsXML(addService));
        System.out.println("Add Output as Text: " + getOutputAsText(addService));
        System.out.println("---------------------------------------------------");
 
        WebTarget subService = target.path(SUB_PATH).path(a + "/" + b);
  
        System.out.println("Sub Output as XML: " + getOutputAsXML(subService));
        System.out.println("Sub Output as Text: " + getOutputAsText(subService));
        System.out.println("---------------------------------------------------");
     
        Response response = getResponse(addService);
        System.out.println(response.getStatus());
        System.out.println(response.toString());
        
    }
 
    private static Response getResponse(WebTarget service) {
        return service.request().accept(MediaType.TEXT_XML).get(Response.class);
    }
 
    private static String getOutputAsXML(WebTarget service) {
        return service.request().accept(MediaType.TEXT_XML).get(String.class);
    }
 
    private static String getOutputAsText(WebTarget service) {
        return service.request().accept(MediaType.TEXT_PLAIN).get(String.class);
    }
}
