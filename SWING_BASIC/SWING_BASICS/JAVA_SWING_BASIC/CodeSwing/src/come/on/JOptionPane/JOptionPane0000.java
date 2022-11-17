package come.on.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPane0000 {

	public static void main(String[] args) {
//------------------------      5-TYPES OF MESSAGE SIGN AS BELOW   ----------------------------- 
		/*while(true) {
		JOptionPane.showMessageDialog(null, "OE BHAI TA MARIS0", "HAHAHAH", JOptionPane.WARNING_MESSAGE);
		}*/
//		JOptionPane.showMessageDialog(null, "OE BHAI TA MARIS1", "GADHA K XA", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "OE BHAI TA MARIS2", "BHANXAS KI POLICE LAI?", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "OE BHAI TA MARIS3", "POLICE LAI NA BHAN", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null, "OE BHAI TA MARIS4", "5 LAKH DE", JOptionPane.INFORMATION_MESSAGE);
		
		
		
//----------------------    CONFRIMATION DIALOG BOX     -----------------------------------
		
		/*int ans= JOptionPane.showConfirmDialog(null, "OE KHANA KHAIS?", "DINCHARYA", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(ans);
		*/
		/*String input =JOptionPane.showInputDialog("Tero nam k ho ?");
		System.out.println("Mero nam "+input+" "+"ho");
		*/
		
//------------------------  WE CAN USE ALL THE ABOVE MESSAGE BOX ALL IN ONE AS       --------------------		
		ImageIcon icon=new ImageIcon("smilees.png");
		String response[]= {"Probably!!"," yesss!!!!!!!!!!!!","It's hard but not impossibel"};
		JOptionPane.showOptionDialog(null, 
				"WIN THE WORLD", 
				"WILL YOU?", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE, 
				icon,
				response,
				0);
	}

}
