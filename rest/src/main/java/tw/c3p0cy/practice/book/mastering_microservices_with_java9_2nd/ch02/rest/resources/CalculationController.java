package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest.resources;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.lib.model.Calculation;

/**
 * Spring's HTTP message converter support, the Calculation object gets converted to JSON
 * automatically. You don't need to do this conversion manually. If Jackson 2 is on the classpath,
 * Spring's MappingJackson2HttpMessageConverter converts the Calculation object to JSON.
 * 
 * @author Minus
 *
 */
@RestController
@RequestMapping("caculation")
public class CalculationController {

  private static final String PATTERN = "^-?+\\d+\\.?+\\d*$";

  /**
   * 
   * @param b
   * @param e
   * @return
   */
  @RequestMapping("/power")
  public Calculation pow(@RequestParam(value = "base") String b,
      @RequestParam(value = "exponent") String e) {
    List<String> input = new ArrayList<String>();
    input.add(b);
    input.add(e);
    List<String> output = new ArrayList<String>();
    String powValue;
    if (b != null && e != null && b.matches(PATTERN) && e.matches(PATTERN)) {
      powValue = String.valueOf(Math.pow(Double.valueOf(b), Double.valueOf(e)));
    } else {
      powValue = "Base or/and Exponent is/are not set to numeric value.";
    }
    output.add(powValue);
    return new Calculation(input, output, "power");
  }

  /**
   * 
   * @param aValue
   * @return
   */
  @RequestMapping(value = "/sqrt/{value:.+}", method = GET)
  public Calculation sqrt(@PathVariable(value = "value") String aValue) {
    List<String> input = new ArrayList<String>();
    input.add(aValue);
    List<String> output = new ArrayList<String>();
    String sqrtValue;
    if (aValue != null && aValue.matches(PATTERN)) {
      sqrtValue = String.valueOf(Math.sqrt(Double.valueOf(aValue)));
    } else {
      sqrtValue = "Input value is not set to numeric value.";
    }
    output.add(sqrtValue);
    return new Calculation(input, output, "sqrt");
  }
}
