package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.lib.model;

import java.util.List;

public class Calculation {

  private List<String> input;
  private List<String> output;
  String function;

  public Calculation(List<String> input, List<String> output, String function) {
    super();
    this.input = input;
    this.output = output;
    this.function = function;
  }

  public List<String> getInput() {
    return input;
  }

  public void setInput(List<String> input) {
    this.input = input;
  }

  public List<String> getOutput() {
    return output;
  }

  public void setOutput(List<String> output) {
    this.output = output;
  }

  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }



}
