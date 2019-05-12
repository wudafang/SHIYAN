package com.school;

public class Juxing {
int cd;
int kd;
public int zhouchang(){
	int zc=2*cd+2*kd;
	return zc;
}
public int mianji(){
	int mj=cd*kd;
	return mj;
}
public Juxing(int cd,int kd){
	this.cd=cd;
	this.kd=kd;
}










@Override
public String toString() {
	return "Juxing [cd=" + cd + ", kd=" + kd + "]";
}






public static void main(String[] args){
	Juxing q=new Juxing(200,500);
	System.out.println("这个广场的周长为"+q.zhouchang()+"面积为"+q.mianji());
	System.out.println(q.toString());
}
}
