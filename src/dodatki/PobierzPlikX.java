package dodatki;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class PobierzPlikX {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://api.nbp.pl/api/exchangerates/tables/A?format=xml");
			
			try (InputStream dane = url.openStream()){
				Files.copy(dane, Paths.get("waluty.xml"), StandardCopyOption.REPLACE_EXISTING);
				System.out.println("Gotowe");
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
