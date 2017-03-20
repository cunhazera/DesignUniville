package com.design.command;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class CommandTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		JMenu menu = new JMenu("Say");
		bar.add(menu);
		JToolBar toolBar = new JToolBar();
		frame.add(toolBar, BorderLayout.NORTH);
		JTextArea textArea = new JTextArea(10, 40);
		frame.add(textArea, BorderLayout.CENTER);
		GreetingAction helloAction = new GreetingAction("Hello, World", textArea);

	}

}
