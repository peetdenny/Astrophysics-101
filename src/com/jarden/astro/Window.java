package com.jarden.astro;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window{
	JFrame frame = new JFrame("Whisper");
	JPanel clear = new JPanel();
	JPanel obfuscated = new JPanel();

	public static void main(String[] args) {
		Window w = new Window();
		w.launch();
	}

	private void launch() {
		frame.setSize(1000, 1000);
		JPanel holder = new JPanel();
		holder.setLayout(new GridLayout(2,1));
		holder.add(obfuscated);
		holder.add(clear);
		frame.setVisible(true);
	}
}
