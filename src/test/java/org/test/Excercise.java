package org.test;

public class Excercise extends LibGlobal {
public static void main(String[] args) throws InterruptedException {
	browserConfig();
	openUrl("https://facebook.com");
	maximizeWindow();
	LoginPF l=new LoginPF();
	 type(l.getTxtEmail(),"welcome");
	 type(l.getTxtPass(),"pass");
	click(l.getBtnLogin());
	Thread.sleep(3000);
	close();
	
}
}
