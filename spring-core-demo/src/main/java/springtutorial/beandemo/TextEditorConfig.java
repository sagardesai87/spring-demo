package springtutorial.beandemo;

import org.springframework.context.annotation.*;

import springtutorial.beandemo.service.SpellChecker;
import springtutorial.beandemo.service.TextEditor;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean 
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}