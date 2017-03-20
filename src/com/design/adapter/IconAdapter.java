package com.design.adapter;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class IconAdapter extends JComponent {

	private static final long serialVersionUID = 1L;
	private Icon icon;

	public IconAdapter(Icon icon) {
		this.icon = icon;
	}
	
	public void paintComponent(Graphics g) {
		icon.paintIcon(this, g, 0, 0);
	}
	

	public Dimension getPreferredSize() {
		return new Dimension(icon.getIconWidth(), icon.getIconHeight());
	}

}
