package q_lab4;
import java.util.Random;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class u_i extends JPanel implements MouseListener{
	String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	int n[]={1,2,3,4,5,6,7,8,9,2};
	int x=0, check=0;
	int pass[]={9,2,3,8,5};
	int count=0,count2=0;
	int[] number = new int[5];
	public void paint(Graphics comp){
		int position;
		Random rand = new Random();
		 Graphics2D comp2D = (Graphics2D) comp;
		 comp2D.drawRect(5, 5, 100, 100);
		 comp2D.drawRect(5, 105, 100, 100);
		 comp2D.drawRect(105, 5, 100, 100);
		 comp2D.drawRect(105, 105, 100, 100);
		 comp2D.drawRect(205, 105, 100, 100);
		 comp2D.drawRect(205, 5, 100, 100);
		 comp2D.drawRect(305, 105, 100, 100);
		 comp2D.drawRect(305, 5, 100, 100);
		 comp2D.drawRect(405, 105, 100, 100);
		 comp2D.drawRect(405, 5, 100, 100);
		while(x<10){
			position=1*rand.nextInt(11);
			switch(position){
			case 1:
				if(p1==null){
					p1=String.valueOf(n[x]);
				 comp2D.drawString(String.valueOf(n[x]), 55, 55);
				 x++;
				 }
				break;
			case 2:
				if(p2==null){
					p2=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 155, 55);
				x++;
				}
				break;
			case 3:
				if(p3==null){
					p3=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 255, 55);
				x++;
				}
				break;
			case 4:
				if(p4==null){
					p4=String.valueOf(n[x]);
					comp2D.drawString(String.valueOf(n[x]), 355, 55);
					x++;
					}
				break;
			case 5:
				if(p5==null){
					p5=String.valueOf(n[x]);
					comp2D.drawString(String.valueOf(n[x]), 455, 55);
					x++;
					}
				break;
			case 6:
				if(p6==null){
					p6=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 55, 155);
				x++;
				}
				break;
			case 7:
				if(p7==null){
					p7=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 155, 155);
				x++;
				}
				break;
			case 8:
				if(p8==null){
					p8=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 255, 155);
				x++;
				}
				 break;
			case 9:
				if(p9==null){
					p9=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 355, 155);
				x++;
				}
				break;
			case 10:
				if(p10==null){
					p10=String.valueOf(n[x]);
				comp2D.drawString(String.valueOf(n[x]), 455, 155);
				x++;
				}
				break;
			}	
		}

		
	}
     public void mousePressed(MouseEvent e) {}
     public void mouseReleased(MouseEvent e) {}
     public void mouseEntered(MouseEvent e) {}
     public void mouseExited(MouseEvent e) { }
     

     public void mouseClicked(MouseEvent e) {
    	 if (count<5){
    	 Point pos=e.getPoint();
int x=(int)(pos.getX());
int y=(int)(pos.getY());
//System.out.println(x);
//System.out.println(y);
if(x>5&&y>5&&x<105&&y<105){
number[count]=Integer.valueOf(p1);
System.out.println(number[count]);
count++;
     }
else if(x>105&&y>5&&x<205&&y<105){
	number[count]=Integer.valueOf(p2);
	System.out.println(number[count]);
	count++;
}
else if(x>205&&y>5&&x<305&&y<105){
	number[count]=Integer.valueOf(p3);
	System.out.println(number[count]);
	count++;
}
else if(x>305&&y>5&&x<405&&y<105){
	number[count]=Integer.valueOf(p4);
	System.out.println(number[count]);
	count++;
}
else if(x>405&&y>5&&x<505&&y<105){
	number[count]=Integer.valueOf(p5);
	System.out.println(number[count]);
	count++;
}
else if(x>5&&y>105&&x<105&&y<205){
	number[count]=Integer.valueOf(p6);
	System.out.println(number[count]);
	count++;
}
else if(x>105&&y>105&&x<205&&y<205){
	number[count]=Integer.valueOf(p7);
	System.out.println(number[count]);
	count++;
}
else if(x>205&&y>105&&x<305&&y<205){
	number[count]=Integer.valueOf(p8);
	System.out.println(number[count]);
	count++;
}
else if(x>305&&y>105&&x<405&&y<205){
	number[count]=Integer.valueOf(p9);
	System.out.println(number[count]);
	count++;
}
else if(x>405&&y>105&&x<505&&y<205){
	number[count]=Integer.valueOf(p10);
	System.out.println(number[count]);
	count++;
}
if(count==5){answer();}    	 }
     }
     public void answer(){
		 while(count2<5){
	 if(number[count2]==pass[count2]){
		 check++;
		 count2++;
		 System.out.println("count: "+count2+" check: "+check);
	 }else{}
	 }
		 if(check==5){
			 System.out.println("correct");
		 }
     }
}
