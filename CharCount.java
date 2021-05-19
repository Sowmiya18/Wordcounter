import java.awt.*;  
	import javax.swing.*;  
	import java.awt.event.*;  
	public class CharCount extends JFrame implements ActionListener{  
	    JLabel label1,label2,label3;  
	    JTextArea ta;  
	    JButton s;  
	    JButton pad,text;  
	    CharCount(){  
	        super("Wordcounter");  
	        label1=new JLabel("Characters: ");  
	        label1.setBounds(50,50,100,20);  
	        label2=new JLabel("Words: ");  
	        label2.setBounds(50,80,100,20);
	        label3=new JLabel("Characters Without Space:");
	        label3.setBounds(50,110,200,20);
	          
	        ta=new JTextArea();  
	        ta.setBounds(50,140,1300,500);  
	          
	        s=new JButton("Count");  
	        s.setBounds(50,700,80,30);//x,y,w,h  
	        s.addActionListener(this);  
	      
	        pad=new JButton("Pad Color");  
	        pad.setBounds(170,700,110,30);//x,y,w,h  
	        pad.addActionListener(this);  
	  
	        text=new JButton("Text Color");  
	        text.setBounds(340,700, 110,30);//x,y,w,h  
	        text.addActionListener(this);  
	  
	        add(label1);add(label2);add(label3);add(ta);add(s);add(pad);add(text);  
	          
	        setSize(400,400);  
	        setLayout(null);//using no layout manager  
	        setVisible(true);  
	        setDefaultCloseOperation(EXIT_ON_CLOSE);  
	    }  
	    public void actionPerformed(ActionEvent e){  
	        if(e.getSource()==s){  
	        String text=ta.getText();  
	        label1.setText("Characters: "+text.length());  
	        String words[]=text.split("\\s");  
	        label2.setText("Words: "+words.length);
	        int count=0;
	    	char ch[]=text.toCharArray();
	                    for(int i=0;i<text.length();i++){
	                        if(Character.isWhitespace(ch[i])){
	                            count=count+1;
	                        }
	                    }
	                    int withoutwhitespace=text.length()-count;
	                    label3.setText("Characters without Space: "+String.valueOf(withoutwhitespace));
	        }else if(e.getSource()==pad){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
	            ta.setBackground(c);  
	        }else if(e.getSource()==text){  
	            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
	            ta.setForeground(c);  
	        }  
	    }  
	public static void main(String[] args) {  
	    new CharCount();  
	}  

}
