package com.cognizant.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration class.
 * @ComponentScan instructs Spring to scan the com.cognizant.di package
 * and auto-register all @Component-annotated classes as beans.
 */
@Configuration
@ComponentScan(basePackages = "com.cognizant.di")
public class AppConfig {
    // No explicit bean declarations needed — component scanning handles it
}
