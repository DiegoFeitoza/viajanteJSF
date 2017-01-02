package br.com.viajante.entity;

public class Anfitriao {
	private String name, email, phone, address, city, country, type, vagas, restrict, description;
	
	public Anfitriao(){
		
	}

	public Anfitriao(String name, String email, String phone, String address, String city, String country, String type, String vagas,
			String restrict, String description) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
		this.type = type;
		this.vagas = vagas;
		this.restrict = restrict;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVagas() {
		return vagas;
	}

	public void setVagas(String vagas) {
		this.vagas = vagas;
	}

	public String getRestrict() {
		return restrict;
	}

	public void setRestrict(String restrict) {
		this.restrict = restrict;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", city=" + city + ", type=" + type + "]";
	}
	
}
