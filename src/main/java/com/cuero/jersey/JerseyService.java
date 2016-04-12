package com.cuero.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by zhun.qu on 4/11/16.
 */
@Path("/message")
public class JerseyService {
    @GET
    public String getMessage() {
        return "Hello Cuero";
    }
}
