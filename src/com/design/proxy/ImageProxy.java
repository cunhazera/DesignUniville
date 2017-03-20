package com.design.proxy;

import java.awt.*;
import javax.swing.*;

public class ImageProxy implements Icon {

	private String name;
	private ImageIcon image;

	public ImageProxy(String name) {
		this.name = name;
		image = null;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		ensureImageLoaded();
		image.paintIcon(c, g, x, y);
	}

	public int getIconWidth() {

		ensureImageLoaded();
		return image.getIconWidth();

	}

	public int getIconHeight() {
		ensureImageLoaded();
		return image.getIconHeight();
	}

	/**
	 * Carrega a imagem se ela ainda não tiver sido carregada. Exibe a mensagem
	 * quando carregada.
	 */
	private void ensureImageLoaded() {
		if (image == null) {
			System.out.println("Loading " + name);
			image = new ImageIcon(name);
		}
	}

}
