package a7;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp = parser.parseExpression("assignment7 '"); 
		String msg=(String)exp.getValue();
		System.out.println(msg);

	}

}
