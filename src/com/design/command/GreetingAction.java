package com.design.command;

import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

public class GreetingAction extends AbstractAction {

	private String greeting;
	private JTextArea textArea;
	private Action oppositeAction;

	public GreetingAction(String name, JTextArea textArea) {
		this.greeting = name;
		this.textArea = textArea;
	}

	public void setOpposite(Action action) {
		oppositeAction = action;
	}

	public void actionPerformed(ActionEvent event) {
		textArea.append(greeting);
		textArea.append("\n");
		if (oppositeAction != null) {
			setEnabled(false);
			oppositeAction.setEnabled(true);
		}
	}

}
