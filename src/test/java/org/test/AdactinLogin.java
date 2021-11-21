package org.test;

import java.io.IOException;

public class AdactinLogin extends LibGlobal {
public static void main(String[] args) throws IOException {
	browserConfig();
	openUrl("https://adactinhotelapp.com/");
	maximizeWindow();
	RegisterLoginAdactin la=new RegisterLoginAdactin();
	type(la.getLoginUsername(), excelRead(1,1));
	type(la.getLoginPassword(), excelRead(1, 2));
	click(la.getLoginSubmit());
	takesScreenshot("D:\\AutomationScreenshot\\sample.jpeg");
}
}
