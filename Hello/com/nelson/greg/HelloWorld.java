package com.nelson.greg;

import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String [] args) {
        LOGGER.info("Logger Name: " + LOGGER.getName());
    }
}