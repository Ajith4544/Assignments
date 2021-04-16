
package rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/chk/{uname}/{pwd}")
	public String authenticate(@RequestBody @PathVariable("uname") String name,@RequestBody @PathVariable("pwd") String password)
	{
		UserAuthentication u=new UserAuthentication();
		u.setUname(name);
		u.setPwd(password);
		
	}
}
