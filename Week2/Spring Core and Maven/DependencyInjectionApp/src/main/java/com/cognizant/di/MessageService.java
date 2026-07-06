package com.cognizant.di;

import org.springframework.stereotype.Component;

/**
 * Service that provides a greeting message.
 * Annotated with @Component so Spring auto-detects it during component scan.
 */
@Component
public class MessageService {

    public String getMessage() {
        return "Hello from Dependency Injection!";
    }
}
