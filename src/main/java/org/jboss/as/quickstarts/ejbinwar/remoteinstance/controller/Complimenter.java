package org.jboss.as.quickstarts.ejbinwar.remoteinstance.controller;

import org.jboss.as.quickstarts.ejb.remote.stateful.RemoteComplimenterEJB;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("complimenter")
@SessionScoped
public class Complimenter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private RemoteComplimenterEJB myEJB;
	
	private String message;
	
	public void setName(String name) {
		message = myEJB.compliment(name);
	}
	
	public String getMessage() {
		return message;
	}

}
