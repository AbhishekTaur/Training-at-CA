package seventhClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
 
public class CalculatorClient {
    static final String REST_URI = "http://localhost:9090/Web_Services_Seventh_Exercise/rest";
    static final String GET_PATH = "/StudentService/get";
    static final String GETALL_PATH = "/StudentService/getAll";
    static final String PUT_PATH = "/StudentService";
 
    public static void main(String[] args) {
 
        String a = "100";
 
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(REST_URI);
        
        WebTarget getStudent = target.path(GET_PATH).path(a);
        
        System.out.println("Add Output as XML: " + getOutputAsXML(getStudent));
        System.out.println("---------------------------------------------------");
 
        WebTarget getAllStudent = target.path(GETALL_PATH);
  
        System.out.println("Sub Output as XML: " + getOutputAsXML(getAllStudent));
        System.out.println("---------------------------------------------------");
     
        Response response = getResponse(getStudent);
        System.out.println(response.getStatus());
        System.out.println(response.toString());
        
        WebTarget putStudent = target.path(PUT_PATH);
        
        System.out.println("Add Output as XML: " + postOutputAsText(putStudent));
        
        
    }
 
    private static Response getResponse(WebTarget service) {
        return service.request().accept(MediaType.TEXT_XML).get(Response.class);
    }
 
    private static String getOutputAsXML(WebTarget service) {
        return service.request().accept(MediaType.TEXT_XML).get(String.class);
    }
    
    
    static Entity entity = Entity.entity("entity", MediaType.TEXT_XML);
    private static String postOutputAsText(WebTarget service) {
        return service.request().accept(MediaType.TEXT_XML).post(entity,String.class);
    }
}
