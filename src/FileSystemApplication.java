import java.util.ArrayList;
import java.util.List;

public class FileSystemApplication {
	
	public static void main(String[] args) {
		
		ExecutableFile unrar = new ExecutableFile("gnu-linux");
		ExecutableFile iceCat = new ExecutableFile("gnu-hurd");
		
		HtmlFile home = new HtmlFile(iceCat);
		HtmlFile categories = new HtmlFile(iceCat);
		HtmlFile about = new HtmlFile(iceCat);
		HtmlFile contact = new HtmlFile(iceCat);
		
		List<HtmlFile> navigation = new ArrayList<>();
		
		navigation.add(home);
		navigation.add(categories);
		navigation.add(about);
		navigation.add(contact);
		
		HtmlFile menu = new HtmlFile(iceCat, navigation);
		
		DataFile someRarFile = new DataFile("rar", unrar);
		
		
	}

}
