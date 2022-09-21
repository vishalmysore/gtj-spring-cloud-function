package row.vishal.examples;
import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//@SpringBootApplication
public class GTAJavaCloudFunction {

	public static void main(String[] args) {
		SpringApplication.run(GTAJavaCloudFunction.class, args);
	}

	@Bean
	public Function<String, String> hello() {
		return value -> "Hello From GTAJava "+value;
	}
	@Bean
	public Function<String, String> bye() {
		return value -> "Bye From GTAJava "+value;
	}
}