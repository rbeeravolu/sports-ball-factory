/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.and.faced;

/**
 *
 * @author ddh
 */
public class CommandAndFaced {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

		Facade facade = new Facade();
		facade.drawCircle();
		facade.drawRecTangle();
		facade.drawTriangle();

	}

    
}
