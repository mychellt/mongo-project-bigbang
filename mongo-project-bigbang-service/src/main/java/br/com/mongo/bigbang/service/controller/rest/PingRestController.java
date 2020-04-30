package br.com.mongo.bigbang.service.controller.rest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */
@RestController
@RequestMapping("/ping")
public class PingRestController {
    @GetMapping
    @ApiOperation(value = "Ping! Verifying the service", response = String.class, httpMethod = "GET")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success! Service is working", response = String.class)
    })

    public String ping() {
        return "Pong!";
    }
}
