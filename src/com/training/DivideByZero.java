package com.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DivideByZero {
	
	public static final Logger log = LogManager.getLogger(DivideByZero.class);

	int dividerOfZeros(int notZero) {
		log.debug("reachable");
        return notZero / 0;
    }
	
	public static void main(String[] args) {
		 DivideByZero dbz = new DivideByZero();
		 log.debug("reachable");
	     dbz.dividerOfZeros(10);
	     log.debug("unreachable");
	}
}
