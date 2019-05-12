package com.ysd.entity;

public class User {
private int uid;
private String uname;
private String uhobby;
public User(int uid, String uname, String uhobby) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.uhobby = uhobby;
}

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getUhobby() {
	return uhobby;
}

public void setUhobby(String uhobby) {
	this.uhobby = uhobby;
}

public User() {
	
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", uhobby=" + uhobby + "]";
}

}
