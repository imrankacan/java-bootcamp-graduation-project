package javabootcampgraduationproject.libraryAutomation;

import com.sun.deploy.si.SingleInstanceImpl;


public class LibraryAutomationApplication {

	public static void main(String[] args) {

		SingleInstanceImpl.SingleInstanceServer SpringApplication = null;
		SpringApplication.run(LibraryAutomationApplication.class, args);
	}

}
