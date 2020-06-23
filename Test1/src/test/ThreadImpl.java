package test;

import javax.transaction.Synchronization;

public class ThreadImpl extends Thread implements Synchronization   {
String name;	
Test23 t;	
 public ThreadImpl(String name, Test23 t) {
	super();
	this.name = name;
	this.t = t;
}
public void  run() {
	 
	try {
		t.m(name);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public Synchronization m1() {
	return null;
	
}
@Override
public void afterCompletion(int arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeCompletion() {
	// TODO Auto-generated method stub
	
}

}
