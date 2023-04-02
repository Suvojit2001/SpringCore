package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AnnotationExample(String subject) {
		super();
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "AnnotationExample [subject=" + subject + "]";
	}

	public AnnotationExample() {
		super();
	}
	
	@PostConstruct
	public void start() {
		System.out.println("this is init by annotation");
	}
	@PreDestroy
	public void end() {
		System.out.println("this is destroy by annotation");
	}
}
