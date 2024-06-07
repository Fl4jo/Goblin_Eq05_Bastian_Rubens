import com.opencsv.bean.CsvBindByPosition;

public class Clients {
	
	@CsvBindByPosition(position = 0)
    private String Name;

    @CsvBindByPosition(position = 1)
    private String mail;

    @CsvBindByPosition(position = 2)
    private String id_site;

    // Getters and setters go here.
    
    public String toString() {
    	return "Name : "+Name+"     mail : "+mail+"     ID site : " +id_site;
    }
}
