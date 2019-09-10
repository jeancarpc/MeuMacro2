
package meu.macro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author ITEGO
 */
public class MeuMacro {


		public static void main(String[] args) {

		// Loop infinito
		do{
			try{
				Thread.sleep(200);
			//	System.out.println("Executando o macro...");
				}catch(Exception e){
			}
			try{
		//Intanciamos a class robots, para poder usar seus metodos

				Robot robot = new Robot();
	
					robot.keyPress(KeyEvent.VK_F5);
					robot.delay(10);
					robot.keyRelease(KeyEvent.VK_F5);


		//Tempo de espera para clicar na proxima letra...
		robot.delay(15);

		robot.keyPress(KeyEvent.VK_1);
		robot.delay(10);
		robot.keyRelease(KeyEvent.VK_1);					

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_2);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_2);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_3);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_3);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);
	
			robot.keyPress(KeyEvent.VK_4);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_4);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_5);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_5);

		//Tempor de espera para clicar na proxima letra...
			robot.delay(15);
	
			robot.keyPress(KeyEvent.VK_6);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_6);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_7);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_7);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_7);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_7);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_8);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_8);

		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_9);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_9);


		//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_0);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_0);

//Tempo de espera para clicar na proxima letra...
			robot.delay(15);

			robot.keyPress(KeyEvent.VK_MINUS);
			robot.delay(10);
			robot.keyRelease(KeyEvent.VK_MINUS);

		//Tempo de espera para clicar na proxima letra...
		robot.delay(15);

		robot.keyPress(KeyEvent.VK_PLUS);
		robot.delay(10);
		robot.keyRelease(KeyEvent.VK_PLUS);


			System.out.println(" ");
			System.out.println(" Macro finalizando..\n  ");

			}catch (AWTException e) {
				e.printStackTrace();
			}
}while(true);

		}
    
}
