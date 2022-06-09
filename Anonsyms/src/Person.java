import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
 String name;
 public Person(String name) {
	 this.name=name;
 }
 
 
 public String checkname() {
	 if(Pattern.matches("[\\w]*\\s[\\w]*",this.name)) 
	 {	 
	 return "Valid";
 
	 } 
	 else {
		 return "Invalid";
	 }
 }
 
 public void CountOcc(String message) {
	 String rex=".*rome.*";
	 Pattern p= Pattern.compile(rex);
	 Matcher m=p.matcher(message);	 
	 System.out.println(m.matches());
	 while(m.find()) {
		 System.out.print(m.start()+"-"+m.end());
	 }
 }
 public void find(String Test) {
	 String myexp="\\d";
	 Pattern p=Pattern.compile(myexp);
	 String[] newTest=p.split(myexp);
	 for(String str: newTest) {
		 System.out.println(str);
	 }
	 }
}