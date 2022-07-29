package com.dolittle.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.reader.StreamReader;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(DemoApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	@Override
	public void run(String... args) {
		LOG.info("EXECUTING : command line runner");
		System.out.println("Give string: ");
		String thisInput = input();
		for (int i = 0; i < args.length; ++i) {
			LOG.info(thisInput);
			LOG.info("args[{}]: {}", i, args[i]);
		}
	}

}
