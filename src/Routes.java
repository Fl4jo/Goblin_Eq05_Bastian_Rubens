import com.opencsv.bean.CsvBindByPosition;

public class Routes {
	
	@CsvBindByPosition(position = 0)
    private String Origine;

    @CsvBindByPosition(position = 1)
    private String Destination;

    // Getters and setters go here.
    
    public String toString() {
    	return "Origine : "+Origine+"     Destination : "+Destination;
    }
}
