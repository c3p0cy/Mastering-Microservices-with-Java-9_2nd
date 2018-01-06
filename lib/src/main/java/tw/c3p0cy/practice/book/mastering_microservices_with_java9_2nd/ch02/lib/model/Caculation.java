package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.lib.model;

import java.util.List;
import lombok.Data;

@Data
public class Caculation {

  String function;
  private List<String> input;
  private List<String> output;


}
