package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class FeatureHooks {

	@Before("@webTest")
	public void beforeMethod() {
		System.out.println("----Before-------");
	}
	@After("@webTest")
	public void afterMethod() {
		System.out.println("----After-------");
	}
}
