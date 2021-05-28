package com.barnese.jax;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("hello")
public class Hello {
    // This method is called if HTML and XML is not requested
    @Path("{info}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response PlainTextHello(@PathParam("info") String val) {

        String response = Model.enterValue(val.charAt(0));
        System.out.println(val + ", " + response);
        return Response.status(200).entity(response).build();
    }
    // This method is called if XML is requested
    /*@GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {

        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // This method is called if HTML is requested
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello(String mooms) {
        System.out.println("message " + mooms);
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";
    }*/
}   