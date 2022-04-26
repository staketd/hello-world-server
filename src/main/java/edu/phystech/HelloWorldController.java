package edu.phystech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public Response helloWorld() {
        return new Response("Hello, World! Current time is: " + Instant.now());
    }

    private static class Response {
        private String response;

        public Response() {
        }

        public Response(String response) {
            this.response = response;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
    }
}
