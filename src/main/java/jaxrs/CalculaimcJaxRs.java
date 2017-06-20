package jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/restcalculaimc")
public class CalculaimcJaxRs {

	@GET
	@Path("/calcular")
	@Produces("application/json")
	public Calculo calcular(@QueryParam("idade") int idade) {
	  Calculo c = new Calculo(idade);
	  c.calcular();
	  return c;
	}
}