package txtdatacsvs.read;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {   DAO d=new DAO();
    	List<Tiatainc> pass= d.getPassengersFromJsonFile();
    	
    	//d.graphPassengerAges(pass);
    	d.graphPassengerClass(pass);
    	d.graphsurvived(pass);
    	d.graphgender(pass);
        
    }
}
