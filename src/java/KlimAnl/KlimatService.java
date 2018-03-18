package KlimAnl;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.POST;
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType; 
import javax.xml.bind.annotation.XmlElement;
@Path("/KlimatService")

public class KlimatService {
    private static SensorDao sensorer = new SensorDao();
    
    private static List<Sensor> allaTempsensorer = sensorer.getAllTemperaturSensors();
    
    private static List<Sensor> allaLamps = sensorer.getAllLamps();
  
    private static List<Sensor> allaHumiditysensorer = sensorer.getAllHumiditySensors();
    
    
    
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest(){
        return "Test is working fine";
    }
    //Hämta alla tempsensorer
    
    @GET
    @Path("/allatempsensorer")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sensor> getallaTempsensors(){
        return allaTempsensorer;
    }
   
    @GET
    @Path("/allalamps")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sensor> getallLamps(){
        return allaLamps;
    }
     
    @GET
    @Path("/allahumiditysensorer")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Sensor> getallHumiditysensors(){
        return allaHumiditysensorer;
    }
    @POST
    @Path("/tempsensor/add")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response addTempsensor(Sensor k){
        Response res = new Response("Tempsensordata added", Boolean.FALSE);
        System.out.println(k);
        allaTempsensorer.add(k);
        res.setStatus(Boolean.TRUE);
        return res;
        //Adda Tempsenspr http://localhost:8080/KlimAnl/rest/KlimatService/tempsensor/add
        
    }
    @POST
    @Path("/humiditysensor/add")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response addHummiditysensor(Sensor k){
        Response res = new Response("Hummiditysensor added", Boolean.FALSE);
        System.out.println(k);
        allaTempsensorer.add(k);
        res.setStatus(Boolean.TRUE);
        return res;
    }
    
    

}


// WEB Url!  http://localhost:8080/KlimAnl/rest/KlimatService/test