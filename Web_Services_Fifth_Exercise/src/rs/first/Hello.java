package rs.first;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// POJO, no interface no extends

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/base")
public class Hello {
	

  // This method is called if TEXT_PLAIN is request
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String sayPlainTextHello() {
    return "<html> " + "<title>" + "Jersey Application" + "</title>"
            + "<body><h1>" + "HTML Response with just base" + "</body></h1>" + "</html> ";
  }

  @GET
  @Produces(MediaType.TEXT_HTML)
  @Path("/{a}/{b}")
  public String add(@PathParam("a") int a, @PathParam("b") int b){
	  int s = a + b;
	  return "<html> " + "<title>" + "Jersey Application" + "</title>"
      + "<body><h1>" + s + "</body></h1>" + "</html> ";
  }
  // This method is called if XML is request
  @POST
  @Produces(MediaType.TEXT_HTML)
  public String sayXMLHello() {
    return "<html> " + "<title>" + "Jersey Application" + "</title>"
            + "<body><h1>" + "HTML Response" + "</body></h1>" + "</html> ";
  }

  // This method is called if HTML is request
  @GET
  @Path("/next")
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {
    return "<html> " + "<title>" + "Jersey Application" + "</title>"
        + "<body><h1>" + "HTML Response" + "</body></h1>" + "</html> ";
  }

} 