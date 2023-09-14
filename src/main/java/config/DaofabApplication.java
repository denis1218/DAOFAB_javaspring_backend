package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DaofabApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaofabApplication.class, args);
	}
	

//	
//	@GetMapping("/api/parent")
//	public String getParentData() {
//		return "Parent Data";
//	}

}
