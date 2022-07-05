
package pingpongnaradabandara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PingPongNaradaBandaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongNaradaBandaraApplication.class, args);
	}

	@GetMapping("/ping")
	public String hello() {
		return String.format("pong");
	}

}
