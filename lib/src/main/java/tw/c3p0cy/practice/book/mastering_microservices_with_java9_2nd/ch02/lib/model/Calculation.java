package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.lib.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Calculation {

  private List<String> input;
  private List<String> output;
  String function;


}
