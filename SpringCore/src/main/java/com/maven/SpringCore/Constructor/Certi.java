package com.maven.SpringCore.Constructor;

public class Certi {
	private String name;

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}

	public Certi(String name) {
		super();
		this.name = name;
	}
}
