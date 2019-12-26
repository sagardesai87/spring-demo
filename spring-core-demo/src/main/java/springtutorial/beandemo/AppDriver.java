package springtutorial.beandemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springtutorial.beandemo.service.TextEditor;

public class AppDriver {

	public static void main(String[] args) {
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor textEditor = ctx.getBean(TextEditor.class);
		textEditor.spellCheck();
	}

}
