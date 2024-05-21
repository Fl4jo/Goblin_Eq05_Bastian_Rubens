import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

public class BD {
	
	public BD() {
		
		List<Clients> ClientBeans, EntrepotBeans, RoutesBeans, EntrepotSites;
		ArrayList<ArrayList<String>> ListClient = new ArrayList<ArrayList<String>>();
		
		File fileClients = new File("Jeux_de_donnees"+File.separator+"grand"+File.separator+"init-clients-500-200-Carre.csv");
		File fileEntrepot = new File("Jeux_de_donnees"+File.separator+"grand"+File.separator+"init-entrepots-500-100-Carre.csv");
		File fileRoutes = new File("Jeux_de_donnees"+File.separator+"grand"+File.separator+"init-routes-500-750-Carre.csv");
		File fileSites = new File("Jeux_de_donnees"+File.separator+"grand"+File.separator+"init-sites-500-Carre.csv");
		
		try {
			 ClientBeans = new CsvToBeanBuilder(new FileReader(fileClients)).withType(Clients.class).withSeparator(';').build().parse();
			 RoutesBeans = new CsvToBeanBuilder(new FileReader(fileRoutes)).withType(Routes.class).withSeparator(';').build().parse();
		}
		catch (Exception e) {
            e.printStackTrace();
        }

	}

	
	
}
