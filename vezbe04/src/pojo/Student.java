package pojo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Produces(MediaType.APPLICATION_JSON)
@XmlRootElement //dodaje mogucnost da moze sve da se serijalizuje, dodaj uvek
public class Student {
	private int id;
	private String ime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	@GET
	@Path("/")
	public Student getStudent() {
		return this;
	}
}
