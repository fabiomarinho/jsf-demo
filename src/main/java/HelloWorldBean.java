import java.io.Serializable;
import java.util.Date;
import java.util.stream.Stream;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named("helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
	  return "Hello World : " + new Date().toString();
   }
}
