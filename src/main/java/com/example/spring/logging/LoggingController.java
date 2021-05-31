package com.example.spring.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping
    public String testingLoggerMessage(){

        logger.trace("Trace message");
        logger.debug("Debug message");
        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("Error message");

        return "Method te test logger";
    }
}
