package br.com.viajante.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.viajante.controller.UserController;
import br.com.viajante.entity.Anfitriao;

@ManagedBean (name = "createUser")
@RequestScoped
public class CreateUser {
	private Anfitriao anfitriao;
	private boolean hasError;
	private String errorMessage;
	
	public CreateUser() {
		this.anfitriao = new Anfitriao();
	}
		
	public String salvar() {
		
		String outcome;
		
		try {
			UserController controller = new UserController();
			controller.insert(anfitriao);
			
			outcome = "search";
			
		} catch (Exception ex) {
			hasError = true;
			errorMessage = ex.getMessage();
			
			outcome = "index";
		}
		
		return outcome;
	}
	
	public Anfitriao getAnfitriao() {
		return anfitriao;
	}

	public void setAnfitriao(Anfitriao anfitriao) {
		this.anfitriao = anfitriao;
	}

	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

