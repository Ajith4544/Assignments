package assignment5;
import javax.annotation.Resource;
//import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Required;

public class Circle {
	//@Inject
	private point center;

	public point getCenter() {
		return center;
	}
	//@SuppressWarnings("deprecation")
	@Required
	@Resource(name="cen")
	public void setCenter(point center) {
		this.center = center;
	}
	public void getInfo() {
		System.out.println("Center of circle is: (" +center.getX()+" , "+center.getY()+")");
	}
}


