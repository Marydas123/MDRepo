package my.my;

/**
 * Hello world!
 *
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
