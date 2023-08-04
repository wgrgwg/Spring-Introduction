package hello.hellospring;
// 같은 패키지의 하위를 스캔
// 스프링 컨테이너에 스프링 빈을 등록할 때, 기본적으로 싱글톤으로 등록(모두 같은 인스턴스)

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
