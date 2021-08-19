package com.rama.demos.stepdefinitions;

import com.rama.demos.tasks.YourLogoCreateAccountT;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class YourLogoStepDefinitions {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Given("{string} Desea ir a la pagina de {string}")
	public void deseaIrALaPaginaDe(String actorName, String url) {
		theActorCalled(actorName).wasAbleTo(Open.url(url));
	}

	@When("Ingresa a la pagina y hace el registro de usuario")
	public void ingresaALaPaginaYHaceElRegistroDeUsuario(DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(YourLogoCreateAccountT.in(dataTable));
	}
	@Then("Valido que el usuario quede registrado")
	public void validoQueElUsuarioQuedeRegistrado() {

	}





}
