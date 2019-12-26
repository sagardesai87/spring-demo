package springtutorial.componentdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springtutorial.component.*")
public class ComponentConfig {
   /*@Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }*/
}