package main;

import java.io.File;

/**
 * https://www.glfw.org/docs/latest/input_guide.html#joystick
 * @author fep
 *
 */


public class MainInput {

	public static void main(String[] args) {
//		http://wiki.lwjgl.org/wiki/Distributing_Your_LWJGL_Application.html
		System.setProperty("org.lwjgl.librarypath", new File("natives").getAbsolutePath());
		
		InputDetection iDetection = new InputDetection();
		iDetection.doDetection();
		iDetection.printDetection();
		
		
		// Fermeture de la bibliotheque
		iDetection.exitGLFW();
	}

}
