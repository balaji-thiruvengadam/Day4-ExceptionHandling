package com.training;

import java.io.IOException;
import java.net.ServerSocket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckedException {
	
	public static final Logger log = LogManager.getLogger(CheckedException.class);
	
	ServerSocket socket;
	
    void createSocket() throws IOException {
    	log.debug("One socket, coming right up.");
        socket = new ServerSocket(5000);
        log.debug("How'd you like that socket?");
    }

	public static void main(String[] args) {
		
		CheckedException checkedException = new CheckedException();
		try {
			checkedException.createSocket();
		} catch (IOException e) {
			e.printStackTrace();
			log.error("IOException");
		}
	}

}
