package com.design.proxy;

import java.awt.*;
import javax.swing.*;

public class ProxyTester {

	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;

	public static void main(String[] args) {
		JTabbedPane tabbedPane = new JTabbedPane();
		for (String name : imageNames) {
			JLabel label = new JLabel(new ImageProxy(name));
			tabbedPane.add(name, label);
		}
		JFrame frame = new JFrame();
		frame.add(tabbedPane);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	private static final String[] imageNames = { "devonian.gif", "permian.gif", "jurassic1.gif", "jurassic2.gif",
			"cretaceous1.gif", "cretaceous2.gif", "cretaceous3.gif", "eocene1.gif", "eocene2.gif", "oligocene.gif",
			"miocene.gif", "pleistocene.gif" };

}