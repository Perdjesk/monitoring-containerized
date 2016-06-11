package org.blu.me;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import com.codahale.metrics.annotation.Timed;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.common.TextFormat;


@Path("metrics")
public class Metrics {


    @GET
    @Produces(TextFormat.CONTENT_TYPE_004)
    @Timed
    public Response get() {
        StreamingOutput stream = new StreamingOutput() {
            public void write(OutputStream os) throws IOException, WebApplicationException {
              Writer writer = new BufferedWriter(new OutputStreamWriter(os));
              TextFormat.write004(writer, CollectorRegistry.defaultRegistry.metricFamilySamples());
              writer.flush();
            }
          };
        return Response.ok(stream).build();
    }
}
