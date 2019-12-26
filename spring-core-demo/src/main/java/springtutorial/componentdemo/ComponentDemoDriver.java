package springtutorial.componentdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springtutorial.componentdemo.service.TextEditor;


public class ComponentDemoDriver {
	
	public static void main(String[] args) {
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(ComponentConfig.class);
		TextEditor textEditor = ctx.getBean(TextEditor.class);
		textEditor.spellCheck();
	}
	
	
}
