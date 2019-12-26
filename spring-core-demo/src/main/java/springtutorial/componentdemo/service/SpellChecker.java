package springtutorial.componentdemo.service;

import org.springframework.stereotype.Service;

@Service
public class SpellChecker {
	
	public SpellChecker() {
		System.out.println("Inside componentdemo SpellChecker constructor.");
	}

	public void checkSpelling() {
		System.out.println("Inside componentdemo checkSpelling.");
	}
}
