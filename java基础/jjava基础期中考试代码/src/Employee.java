/**
 * 这是一个实体类
 * @author 1805吴大芳
 *实体类包含私有属性     构造方法  有参和无参  to String()方法        get set方法
 */
public class Employee {
private int num;
private String name;
private String banji;
private String kemu;
private double score;
/**
 * 无参方法
 */
public Employee() {
	super();
	
}
/**
 * 有参方法
 */
public Employee(int num, String name, String banji, String kemu, double score) {
	super();
	this.num = num;
	this.name = name;
	this.banji = banji;
	this.kemu = kemu;
	this.score = score;
}
/**
 * to  String方法
 */
@Override
public String toString() {
	return "学号：" + num + ",姓名：" + name + ",班级：" + banji
			+ ",科目：" + kemu + ",成绩：" + score ;
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
public String getBanji() {
	return banji;
}
public void setBanji(String banji) {
	this.banji = banji;
}
public String getKemu() {
	return kemu;
}
public void setKemu(String kemu) {
	this.kemu = kemu;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
 

}
