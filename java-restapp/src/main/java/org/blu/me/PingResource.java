package org.blu.me;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;


@Path("ping")
public class PingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Timed
    public String get() throws InterruptedException {
    	  Thread.sleep(2000);
        return "pong";
    }
}
