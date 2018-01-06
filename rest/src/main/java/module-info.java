module tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest {

  requires spring.core; 
  requires spring.beans; 
  requires spring.context; 
  requires spring.aop; 
  requires spring.web; 
  requires spring.expression; 

  requires spring.boot; 
  requires spring.boot.autoconfigure; 

  requires tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.lib; 

  exports tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest; 
  exports tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest.resources; 

  opens tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest; 
  opens tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.ch02.rest.resources;
}
