package com.barnese.jax;

import java.net.URI;
import java.util.Scanner;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;
public class ClientTest {
    public static void main(String[] args) {
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(getBaseURI());



        //Now printing the server code of different media type
        //System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class));
        //System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));
        //System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));

        //Response val = target.path("rest").path("hello").path("values").request(MediaType.TEXT_PLAIN).post(Entity.text("{HI}"));

        //Values v = val.readEntity(Values.class);


        //System.out.println(v.valueIndex + " " + v.value);
        char c = ' ';
        Scanner s = new Scanner(System.in);
        while(c != 'q') {
            System.out.println("Enter next digit");
            String line = s.nextLine();
            c = line.charAt(0);

            Response val = target.path("rest").path("hello/{info}").resolveTemplate("info", line).
                    request(MediaType.TEXT_PLAIN).get();


            System.out.println(val.readEntity(String.class));
        }
    }
    private static URI getBaseURI() {
        //here server is running on 4444 port number and project name is restfuljersey
        return UriBuilder.fromUri("http://localhost:8080/test").build();
    }
}   