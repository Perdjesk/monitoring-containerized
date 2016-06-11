package org.blu.me;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.jersey2.InstrumentedResourceMethodApplicationListener;

import io.prometheus.client.dropwizard.DropwizardExports;
import io.prometheus.client.hotspot.DefaultExports;

public class App {

	public static final String BASE_URI = "http://0.0.0.0:8080/";
	static MetricRegistry dwMetricRegistry = new MetricRegistry();

	public static HttpServer startServer() {
		ResourceConfig rc = new ResourceConfig().packages("org.blu.me");
		rc.register(new InstrumentedResourceMethodApplicationListener(dwMetricRegistry));

		return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
	}

	public static void main(String[] args) throws IOException {
		final HttpServer server = startServer();

		DefaultExports.initialize();
		new DropwizardExports(dwMetricRegistry).register();

	}

}
