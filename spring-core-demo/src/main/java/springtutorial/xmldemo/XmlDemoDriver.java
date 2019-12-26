package springtutorial.xmldemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springtutorial.xmldemo.service.TextEditor;


public class XmlDemoDriver {

	public static void main(String[] args) {
		ApplicationContext ctx = 
		         new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor textEditor = ctx.getBean(TextEditor.class);
		textEditor.spellCheck();

	}

}
