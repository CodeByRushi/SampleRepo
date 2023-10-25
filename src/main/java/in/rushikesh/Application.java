package in.rushikesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("Task 102 completed.");

		System.out.print("Task 101 is ongoing");

		System.out.println("Changes made on cloud master.");
		
		System.out.println("Changes made on local-cloud develop");


		SOP("Changes made in dev local-cloud");

		

	}

}
