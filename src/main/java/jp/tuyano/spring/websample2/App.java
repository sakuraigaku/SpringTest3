package jp.tuyano.spring.websample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new FileSystemXmlApplicationContext("file:/c:/bean.xml");
		MyBean bean = (MyBean)app.getBean("bean1");
		System.out.println(bean);
	}
}
