package Hw4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Game0 implements ActionListener{
// ı defined the JFrame,JButton,JRadioButton,JLabel,JComboBox,ImageIcon,num1 and num2. creating the random objects.
	int score=10;
	int num1;
	int num2;
    JFrame f;
    JFrame f1;
    JButton b1;
    JPanel p;
    JPanel p1;
    JLabel l;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    ButtonGroup bg;
    JComboBox c;
    ImageIcon img;
    ImageIcon img2;
    
    BufferedImage buffImage[];
    Random random= new Random();
    
    public Game0() {
    // creating the object for JFrame,JButton,JRadioButton,JLabel,JComboBox,ImageIcon.
    	f = new JFrame();
    	f1 = new JFrame();
        b1 = new JButton("Check!");
        p = new JPanel();
        p1 = new JPanel();
        l = new JLabel("YOUR SCORE:" + 10);
        l2 = new JLabel("Player's Card");
        l3 = new JLabel("Computer's Card");
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        r1 = new JRadioButton("Club");
        r2 = new JRadioButton("Spade");
        r3 = new JRadioButton("Diamond");
        r4 = new JRadioButton("Heart");
        
        // the writing turn into the different colors thanks to this method(setForeground(Color.BLUE);).
        l.setForeground(Color.BLUE);
  	    l2.setForeground(Color.BLUE);
  	    l3.setForeground(Color.BLUE);
     // ImageIcon() — creates an ImageIcon from an image object
        img2 = new ImageIcon("back.jpg");
        l4.setIcon(img2);
        l5.setIcon(img2);
//        creating array for cards numbers. then, we put them in comboBox object.
        String[] numbers = {"Ace","2","3","4","5","6","7","8","9","10","jack", "queen","king"};
        c = new JComboBox(numbers);

//        setting size,title,background and visible of frame when we use these methods.
        f.setVisible(true);
        f.setSize(400, 400);
        f.setTitle("Card Game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.gray);
        
       

//  setting dimension,title,background of panel when we use these methods.
        p.setPreferredSize(new Dimension(300, 300));
        p.setBackground(Color.gray);
        p1.setPreferredSize(new Dimension(300, 300));
// setting the x,y dimension and  width , height for JButton,JRadioButton,JLabel,JComboBox.
        b1.setBounds(130, 300, 100, 30);
        l.setBounds(120, 10, 200, 40);
        l2.setBounds(100, 250, 200, 40);
        l3.setBounds(200, 250, 200, 40);
        l4.setBounds(102, 140, 100, 120);
        l5.setBounds(205, 140, 100, 120);
        l6.setBounds(150, 150, 300, 30);
        r1.setBounds(100,50,100,20);
        r2.setBounds(200,50,100,20);
        r3.setBounds(100,100,100,20);
        r4.setBounds(200,100,100,20);
        c.setBounds(10,70,70,30);
        
        
//        adding radioButton in ButtonGroup object.
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
//      adding in JFrame .
        f.add(c);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(b1);
        f.add(l);
        f.add(l2);
        f.add(l3);
        f.add(l5);
        f.add(l4);
        
 //   The addActionListener method takes the current class object as a parameter. The "this" key word simply means "this object I'm working in right now". 
 //    If you are using netbeans, you can type "this" and put a period after it to see all the methods defined in "this" class.
        
        
        b1.addActionListener(this); 
        r1.addActionListener(this); 
        r2.addActionListener(this); 
        r3.addActionListener(this); 
        r4.addActionListener(this); 
        

    	
    	
    	
    	
    	
    	
    }
    
    
//    The actionPerformed() method is invoked automatically whenever you click on the registered component.


    public void actionPerformed(ActionEvent e) {
        String s = "Cards\\";
        String s3 = ".jpg";
        String s1 = "";
        String s2 = "";
        String[] cardsSymbol = {"c", "h", "s", "d"};
		String[] cards = {"Ace","2","3","4","5","6","7","8","9","10","jack", "queen","king"};
		num1 = random.nextInt(13);// random between 0_12
    	num2 = random.nextInt(4); // random between 0_3
//		selecting  string value of array in ComboBox .
        s2 = c.getSelectedItem().toString();
//        if we selected Club , the card turn into Club card.
        if(e.getSource()==r1) {
            s1="c";
            l4.setIcon(new ImageIcon(s+s2+s1+s3));//s=cards s2=cards numbers ,s1=c,s3=jpg.
        }
//          if we selected Diamond , the card turn into Diamond card.
        if(e.getSource()==r2) {
            s1="d";
            l4.setIcon(new ImageIcon(s+s2+s1+s3));//s=cards s2=cards numbers,s1=d,s3=jpg.
        }
//          if we selected Spade , the card turn into Spade  card.
        if(e.getSource()==r3) {
            s1="s";
            l4.setIcon(new ImageIcon(s+s2+s1+s3));//s=cards s2=cards numbers,s1=s,s3=jpg.
        }
//          if we selected Heart, the card turn into Heart card.
        if(e.getSource()==r4) {
            s1="h";
            l4.setIcon(new ImageIcon(s+s2+s1+s3));//s=cards s2=cards numbers,s1=h,s3=jpg.
        }
//         if we click on the Check button , the compare  to the random cards end selected cards .
        if(e.getSource()==b1) {
        	
//        	we setting Symbols and numbers of random cards.
			l5.setIcon(new ImageIcon(s+cards[num1]+cardsSymbol[num2]+s3));
			
			if(s+s2+s1+s3 == s+cards[num1]+cardsSymbol[num2]+s3){
//				if the symbols and numbers of selected cards equal to the symbols and numbers of random cards, we add to 10 on the score.
	        	score+=10;
	            l.setText("YOUR SCORE: " + score);
	        		
	        }
//			if the symbols of selected cards equal to the symbols  of random cards, we add to 3 on the score.
	        else if(s1 == cardsSymbol[num2]) {
	        	score+=3;
	        	l.setText("YOUR SCORE: " + score);
	        }
//			if the  numbers of selected cards equal to the  numbers of random cards, we add to 5 on the score.
	        else if(s2==cards[num1]) {
	        	score+=5;
	        	l.setText("YOUR SCORE: " + score);
	        }
//			if the symbols or numbers of selected cards doesn't equal to the symbols or numbers of random cards, we add to -1 on the score.
	        else {
	        	score-=1;
	        	l.setText("YOUR SCORE: " + score);
	        }
	        
		}
       
       
//    if our score is greater than 25, we see the new frame such as ,like "you win".
    	if (score > 25) {
    		l6.setText("You win!");
    		  f1.setVisible(true);
              f1.setSize(400, 400);
              f1.setTitle("Card Game");
              f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              f1.setLayout(null);
              f1.getContentPane().setBackground(Color.green);
              f1.add(l6);
              l6.setFont(new Font("Serif", Font.PLAIN, 30));
    	} 
//    	if our score is not  greater than 25 and equal to 0, we see the new frame such as ,like "you lose".
    	else if (score == 0) {
    		l6.setText("You lose!");
    		  f1.setVisible(true);
              f1.setSize(400, 400);
              f1.setTitle("Card Game");
              f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              f1.setLayout(null);
              f1.getContentPane().setBackground(Color.red);
              f1.add(l6);
              l6.setFont(new Font("Serif", Font.PLAIN, 30));
    	}
    		
    
    
		
        
    
	}
        
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
