import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class CopyPaste {

    public static void main(String[] args) {
    	
    	// Here, I define user only can enter one argument, not more than one or anyone.
    	if (args.length > 1 ) {
    		System.out.println("You enter more than one argument. Bye!");
    	}
    	else if (args.length < 1) {
    		System.out.println("You don't enter a argument. Bye!");
    	}

        Path origenPath = FileSystems.getDefault().getPath(args[0]);
        Path destinoPath = FileSystems.getDefault().getPath(args[1]);

        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

}