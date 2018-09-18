package mikemcgowan

import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {}

object Application {

  def main(args: Array[String]): Unit = {
    SpringApplication run (classOf[Application], args: _*)
  }

  @Bean
  def commandLineRunner(ctx: ApplicationContext): CommandLineRunner =
    (_: Array[String]) => {
      println("Let's inspect the beans provided by Spring Boot:")
      ctx.getBeanDefinitionNames.sorted foreach println
    }

}
