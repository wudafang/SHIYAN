import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Emploee {
private int num;
private String name;
private String nex;
private Date birthday;
public Emploee(int num, String name, String nex, Date birthday) {
	super();
	this.num = num;
	this.name = name;
	this.nex = nex;
	this.birthday = birthday;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNex() {
	return nex;
}
public void setNex(String nex) {
	this.nex = nex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public int getAge(){
	Calendar c=Calendar.getInstance();
	int year=c.get(Calendar.YEAR);
	c.setTime(birthday);
	int birthYear=c.get(Calendar.YEAR);
	return year-birthYear;
}
@Override
public String toString() {
	SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
	return "工号\t"+this.num+"\t姓名\t"+this.name+"\t性别:\t"+this.nex+"\t生日\t"+d.format(this.birthday)+"年龄"+this.getAge();
}

}
