import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Christian Santiago");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(600, 200);
		myFrame.setSize(500, 500);
		myFrame.setVisible(true);
		
		  MyPanelClass myPanel = new MyPanelClass();
          myFrame.getContentPane().add(myPanel);
	}
}