
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public  class calculator  extends JFrame implements ActionListener
{

        
    
    JFrame f;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bclear,bback,bmod,bpoint,bequal;
    Label l1;
    double num1,num2,flag,c;

     public calculator()
     {    
        f=new JFrame("CALCULATOR");
       l1=new Label();
       l1.setBackground(Color.LIGHT_GRAY);
       l1.setBounds(50,20,275,50);
        b0=new JButton("0");
        b0.setBounds(125,300,50,30);
        b1=new JButton("1");
        b1.setBounds(50,250,50,30);
        b2=new JButton("2");
        b2.setBounds(125,250,50,30);
        b3=new JButton("3");
        b3.setBounds(200,250,50,30);
        b4=new JButton("4");
        b4.setBounds(50,200,50,30);
        b5=new JButton("5");
        b5.setBounds(125,200,50,30);
        b6=new JButton("6");
        b6.setBounds(200,200,50,30); 
        b7=new JButton("7");
        b7.setBounds(50,150,50,30); 
        b8=new JButton("8");
        b8.setBounds(125,150,50,30); 
        b9=new JButton("9");
        b9.setBounds(200,150,50,30);

        badd=new JButton("+");
        badd.setBounds(275,250,50,30);
        bsub=new JButton("-");
        bsub.setBounds(275,150,50,30);
        bmul=new JButton("*");
        bmul.setBounds(275,200,50,30);
        bdiv=new JButton("/");
        bdiv.setBounds(275,100,50,30);
        bclear=new JButton("C");
        bclear.setBounds(50,100,50,30);
        bback=new JButton("B");
        bback.setBounds(125,100,50,30);
        bmod=new JButton("%");
        bmod.setBounds(200,100,50,30);
        bpoint=new JButton(".");
        bpoint.setBounds(50,300,50,30);
        bequal=new JButton("=");
        bequal.setBounds(210,300,100,30);

      //b1.addActionListener(this);

         f.add(l1);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(b0);
        b0.addActionListener(this);
        f.add(b1);
        b1.addActionListener(this);
        f.add(b2);
        b2.addActionListener(this);
        f.add(b3);
        b3.addActionListener(this);
        f.add(b4);
        b4.addActionListener(this);
        f.add(b5);
        b5.addActionListener(this);
        f.add(b6);
        b6.addActionListener(this);
        f.add(b7);
        b7.addActionListener(this);
        f.add(b8);
        b8.addActionListener(this);
        f.add(b9);
        b9.addActionListener(this);
        f.add(badd);
        badd.addActionListener(this);
        f.add(bsub);
        bsub.addActionListener(this);
        f.add(bmul);
        bmul.addActionListener(this);
        f.add(bdiv);
        bdiv.addActionListener(this);
        f.add(bmod);
        bmod.addActionListener(this);
        f.add(bpoint);
        bpoint.addActionListener(this);
        f.add(bclear);
        bclear.addActionListener(this);
        f.add(bback);
        bback.addActionListener(this);
        f.add(bequal);
        bequal.addActionListener(this);

    }


public static void main(String[] args) {
   new calculator();
}


@Override
public void actionPerformed(ActionEvent e) {
    
    String a,b;

      if(e.getSource()==b0)
      {
        a=l1.getText();
        b=a+"0";
        l1.setText(b);
      }
      if(e.getSource()==b1)
      {
        a=l1.getText();
        b=a+"1";
        l1.setText(b);
      }
      if(e.getSource()==b2)
      {
        a=l1.getText();
        b=a+"2";
        l1.setText(b);
      }
      if(e.getSource()==b3)
      {
        a=l1.getText();
        b=a+"3";
        l1.setText(b);
      }
      if(e.getSource()==b4)
      {
        a=l1.getText();
        b=a+"4";
        l1.setText(b);
      }
      if(e.getSource()==b5)
      {
        a=l1.getText();
        b=a+"5";
        l1.setText(b);
      }
      if(e.getSource()==b6)
      {
        a=l1.getText();
        b=a+"6";
        l1.setText(b);
      }
      if(e.getSource()==b7)
      {
        a=l1.getText();
        b=a+"7";
        l1.setText(b);
      }
      if(e.getSource()==b8)
      {
        a=l1.getText();
        b=a+"8";
        l1.setText(b);
      }
      if(e.getSource()==b9)
      {
        a=l1.getText();
        b=a+"9";
        l1.setText(b);
      }
      if(e.getSource()==badd)
      {
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("invalid format");
            return;
        }
        b=" ";
        l1.setText(b);
        flag=1;

       
      }
      if(e.getSource()==bsub)
      {
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("invalid format");
            return;
        }
        b=" ";
        l1.setText(b);
        flag=2;
      }
      if(e.getSource()==bmul)
      {
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("invalid format");
            return;
        }
        b=" ";
        l1.setText(b);
        flag=3;
      }
      if(e.getSource()==bdiv)
      {
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("invalid format");
            return;
        }
        b=" ";
        l1.setText(b);
        flag=4;
      }
      if(e.getSource()==bmod)
      {
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("invalid format");
            return;
        }
        b=" ";
        l1.setText(b);
        flag=5;
      }
      if(e.getSource()==bpoint)
      {
        a=l1.getText();
        b=a+".";
        l1.setText(b);
      }
      if(e.getSource()==bback)
      {
        a=l1.getText();
        try{
        b=a.substring(0,a.length()-1);
        }
        catch (StringIndexOutOfBoundsException z)
        {
            return;
        }
        l1.setText(b);
        
      }
      if(e.getSource()==bequal)
      {
        try{
            num2=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException z)
        {
            l1.setText("Enter the number");
            return;
        }
        if(flag==1)
        c=num1+num2;
        if(flag==2)
        c=num1-num2;
        if(flag==3)
        c=num1*num2;
        if(flag==4)
        c=num1/num2;
        if(flag==5)
        c=num1%num2;
        l1.setText(String.valueOf(c));
      }
      if(e.getSource()==bclear)
      {
        num1=0;
        num2=0;
        c=0;
        flag=0;
        b=" ";
        l1.setText(b);
      }

    }   
 }

