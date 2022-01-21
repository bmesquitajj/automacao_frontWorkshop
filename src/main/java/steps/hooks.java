package steps;

import static utils.utils.acessarSistema;
import static utils.utils.capturaTela;
import static utils.utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@cenario")
	public static void setUp() {
		acessarSistema("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
	}
	
	@After("@cenario")
	public static void tearDown(Scenario scenario) {
		capturaTela(scenario);
		driver.close();
	}
}
