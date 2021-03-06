package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	
	public static void main(String[] args) {
		ToDoList ToDoList = new ToDoList();
		ToDoList.setup();
	}
	
	void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		
		addTask.addActionListener(this);
	}
	
	ArrayList<String> tasks = new ArrayList<String>();
	
	JButton addTask = new JButton();
	JButton viewTask = new JButton();
	JButton removeTask = new JButton();
	JButton saveList = new JButton();
	JButton loadList = new JButton();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addTask)) {
			String input = JOptionPane.showInputDialog("Add a task!");
			tasks.add(input);
		}
		if(e.getSource().equals(viewTask)) {
			for(int i = 0; i < tasks.size(); i++) {
				System.out.println(tasks.get(i));
			}
		}
	}
	
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
}
