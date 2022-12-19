package com.maven.SpringCore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private String pname;

	public Pizza() {
		super();
	}

	@Override
	public String toString() {
		return "Pizza [pname=" + pname + "]";
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	@PostConstruct
	public void start() {
		System.out.println("Pizza : inti");
	}
	@PreDestroy
	public void end() {
		System.out.println("Pizza : destroy");
	}
}
