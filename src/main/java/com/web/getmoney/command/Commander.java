package com.web.getmoney.command;

import javax.servlet.http.HttpServletRequest;

import com.web.getmoney.enums.Action;

public class Commander {
	  public static Command direct(HttpServletRequest request) {
	      System.out.println("commander 도착");  
		  
		    Command cmd = null;
	        System.out.println("commander : "+request.getParameter("action"));
	        switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
	        
	        case CREATE : cmd = null; break;
	        case SEARCH : cmd = null; break;
	        case MOVE : cmd = null; break;
	        case LOGIN : cmd = null; break;
	        }
	        return cmd;
	    }

}
