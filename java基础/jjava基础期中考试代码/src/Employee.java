/**
 * ����һ��ʵ����
 * @author 1805���
 *ʵ�������˽������     ���췽��  �вκ��޲�  to String()����        get set����
 */
public class Employee {
private int num;
private String name;
private String banji;
private String kemu;
private double score;
/**
 * �޲η���
 */
public Employee() {
	super();
	
}
/**
 * �вη���
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
 * to  String����
 */
@Override
public String toString() {
	return "ѧ�ţ�" + num + ",������" + name + ",�༶��" + banji
			+ ",��Ŀ��" + kemu + ",�ɼ���" + score ;
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
