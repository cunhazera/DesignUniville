package com.design.adapter;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class IconAdapterTester {

	public static void main(String[] args) {
		Icon icon = new CarIcon(300);
		JComponent component = new IconAdapter(icon);
		JFrame frame = new JFrame();
		frame.add(component, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
