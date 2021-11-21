package org.test;

import java.io.IOException;

public class AdactinRegister extends LibGlobal{
public static void main(String[] args) throws IOException, InterruptedException {
	browserConfig();
	openUrl("http://adactinhotelapp.com/");
	maximizeWindow();
	RegisterLoginAdactin rl=new RegisterLoginAdactin();
	click(rl.getClickRegisterNow());
	type(rl.getRegUsername(), excelRead(1,5));
	type(rl.getRegPass(), excelRead(3,5));
	type(rl.getRegConfirmPass(), excelRead(3,5));
	type(rl.getRegFullName(), excelRead(1,5));
	type(rl.getRegEmail(), excelRead(1,6));
	Thread.sleep(30000);
	click(rl.getRegCheckbox());
	click(rl.getRegister());

}
}
