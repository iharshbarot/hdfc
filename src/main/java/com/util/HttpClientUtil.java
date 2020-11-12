package com.util;

import java.time.Duration;
import java.util.ResourceBundle;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import org.springframework.scheduling.annotation.Async;

@Async
public class HttpClientUtil {

	private static ResourceBundle messageBundle = ResourceBundle.getBundle("application");
	private static String HDFC_URL = messageBundle.getString("hdfcUrl").trim();
	public static Duration TIMEOUT = Duration.ofSeconds(10);

	public static CompletableFuture<String> postToHDFCAsync(String requestJson) {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(String.format(HDFC_URL))).timeout(TIMEOUT)
				.header("Content-Type", "application/json").POST(BodyPublishers.ofString(requestJson)).build();
		HttpClient client = HttpClient.newHttpClient();
		System.out.println(request);
		return client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body);
	}
}
