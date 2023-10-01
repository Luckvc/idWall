package com.idwall.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.idwall.domain.Wanted;

import reactor.core.publisher.Mono;

@Service
public class FbiService {
	
	private final WebClient webclient;
	
	public FbiService() {
		this.webclient = WebClient.create("https://api.fbi.gov/wanted/list");
	}
	public Mono<Wanted> fetchDataFromApi() {
        return webclient
            .get()
            .uri("") // Replace with your API endpoint
            .retrieve()
            .bodyToMono(Wanted.class);
    }
	
	
}



/*

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiService {

    private final WebClient webClient;

    public ApiService() {
        this.webClient = WebClient.create("https://api.example.com"); // Replace with your API URL
    }

    public Mono<YourApiResponseClass> fetchDataFromApi() {
        return webClient
            .get()
            .uri("/your-api-endpoint") // Replace with your API endpoint
            .retrieve()
            .bodyToMono(YourApiResponseClass.class);
    }
}


*/