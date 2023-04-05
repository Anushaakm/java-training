import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anu.boot.service.CarService;

@SpringBootApplication
public class SpringBootUnderstandingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootUnderstandingApplication.class, args);

		CarService service =  ctx.getBean(CarService.class);
		service.createNewCar(10L, "abc", "lmn");
	}

}

