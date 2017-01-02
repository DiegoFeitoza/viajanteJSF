package br.com.viajante.presentation;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.viajante.controller.UserController;
import br.com.viajante.entity.Anfitriao;
import br.com.viajante.presentation.AnfiService;
 
@ManagedBean(name="dtFilterView")
@ViewScoped
public class FilterView implements Serializable {

	private List<Anfitriao> users;
	private UserController controller;
    private List<Anfitriao> filteredUsers;
     
    @ManagedProperty("#{anfiService}")
    private AnfiService service;
 
    @PostConstruct
    public void init() {
    	this.controller = new UserController();
		
		this.users = this.controller.list();
    }
    
     
    public boolean filterByPrice(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if(filterText == null||filterText.equals("")) {
            return true;
        }
         
        if(value == null) {
            return false;
        }
         
        return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
    }
     
    public List<String> getBrands() {
        return service.getBrands();
    }
     
    public List<String> getColors() {
        return service.getColors();
    }
     
    public List<Anfitriao> getUsers() {
        return users;
    }
 
    public List<Anfitriao> getFilteredUsers() {
        return filteredUsers;
    }
 
    public void setFilteredUsers(List<Anfitriao> filteredUsers) {
        this.filteredUsers = filteredUsers;
    }
 
    public void setService(AnfiService service) {
        this.service = service;
    }
}