package com.barnese.jax;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
    // This method is called if HTML and XML is not requested
    @GET
    @Path("{info}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayPlainTextHello(@PathParam("info") String val) {
      String response = Model.enterValue(val.charAt(0));
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