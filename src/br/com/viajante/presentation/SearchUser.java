package br.com.viajante.presentation;

import java.util.List;
import javax.faces.bean.ManagedBean;

import br.com.viajante.controller.UserController;
import br.com.viajante.entity.Anfitriao;

@ManagedBean
public class SearchUser {
	
	private List<Anfitriao> users;
	private List<Anfitriao> filteredUsers;
	private UserController controller;
	
	public SearchUser() {
		this.controller = new UserController();
		
		this.users = this.controller.list();
	}

	public List<Anfitriao> getUsers() {
		return users;
	}

	public void setUsers(List<Anfitriao> users) {
		this.users = users;
	}

	public List<Anfitriao> getFilteredUsers() {
		return filteredUsers;
	}

	public void setFilteredUsers(List<Anfitriao> filteredUsers) {
		this.filteredUsers = filteredUsers;
	}
	
	
}
