package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
class HelloController {

  @Autowired
  var timeService: TimeService = _

  @RequestMapping(Array("/"))
  def index(): String =
    String format (
      "Greetings from Spring Boot @ %s",
      timeService.localDateTime()
    )

}
