package com.vehicles.vehiclesapplication;

import com.vehicles.vehiclesapplication.models.VehiclesList;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;


@SpringBootApplication
@OpenAPIDefinition(info=@Info(title= "Vehicles API",version="2.0", description = "Vehicles Information"))
@SecurityScheme(name="user",scheme = "basic", type= SecuritySchemeType.HTTP, in= SecuritySchemeIn.HEADER)
public class VehiclesapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclesapplicationApplication.class, args);
		}


}
