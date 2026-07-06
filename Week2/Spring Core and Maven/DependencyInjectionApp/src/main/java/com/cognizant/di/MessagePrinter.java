package com.cognizant.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component that prints a message by delegating to MessageService.
 * Demonstrates constructor-based Dependency Injection.
 */
@Component
public class MessagePrinter {

    private final MessageService messageService;

    /**
     * Spring injects MessageService via constructor injection.
     */
    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
