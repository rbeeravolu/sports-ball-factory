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
class Facade {
    private Shape circle;
	private Shape rectangle;
	private Shape triangle;

	public Facade() {
		super();
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRecTangle() {
		rectangle.draw();
	}

	public void drawTriangle() {
		triangle.draw();
	}
}
