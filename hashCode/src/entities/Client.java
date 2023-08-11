package entities;

import java.util.Objects;

public class Client {
	
	private String name;
	private String emai;
	
	
	
	public Client(String name, String emai) {
		this.name = name;
		this.emai = emai;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmai() {
		return emai;
	}


	public void setEmai(String emai) {
		this.emai = emai;
	}


	@Override
	public int hashCode() {
		return Objects.hash(emai, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(emai, other.emai) && Objects.equals(name, other.name);
	}

	
}
