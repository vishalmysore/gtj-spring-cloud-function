package row.vishal.examples;
import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class GTAJavaSingleFunction {
	public static void main(String[] args) {
		SpringApplication.run(GTAJavaSingleFunction.class, args);
	}

	@Bean
	public Function<String, String> iAmSingle() {
		return value -> "ooohooo , I am single function "+value;
	}
}
