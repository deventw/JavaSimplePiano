import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static java.awt.Color.*;


public class PianoLayout extends JPanel {

    PianoLayout()
    {
        System.out.print("Piano Started");
        this.setPreferredSize(new Dimension(1000,500));
        HandlerClass handler= new HandlerClass();
        this.addMouseListener(handler);
        this.addMouseListener(handler);


    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
//        "Do","#Do", "Re","#Re", "Mi", "Fa","#Fa", "So","#So", "La","#La", "Si", "Do"

        //Do
        g2D.setColor(white);
        g2D.fillRect(0, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(0, 0, 100, 250);
        //Re
        g2D.setColor(white);
        g2D.fillRect(100, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(100, 0, 100, 250);
        //Me
        g2D.setColor(white);
        g2D.fillRect(200, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(200, 0, 100, 250);
        //Fa
        g2D.setColor(white);
        g2D.fillRect(300, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(300, 0, 100, 250);
        //So
        g2D.setColor(white);
        g2D.fillRect(400, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(400, 0, 100, 250);
        //La
        g2D.setColor(white);
        g2D.fillRect(500, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(500, 0, 100, 250);
        //Si
        g2D.setColor(white);
        g2D.fillRect(600, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(600, 0, 100, 250);
        //Do
        g2D.setColor(white);
        g2D.fillRect(700, 0, 100, 250);
        g2D.setColor(black);
        g2D.drawRect(700, 0, 100, 250);
        //--------------------------------------------------------------//
        //#Do
        g2D.setColor(black);
        g2D.fillRect(75, 0, 50, 150);
        g2D.setColor(black);
        g2D.drawRect(75, 0, 50, 150);

        //#Re
        g2D.setColor(black);
        g2D.fillRect(175, 0, 50, 150);
        g2D.setColor(black);
        g2D.drawRect(175, 0, 50, 150);

        //#Fa
        g2D.setColor(black);
        g2D.fillRect(375, 0, 50, 150);
        g2D.setColor(black);
        g2D.drawRect(375, 0, 50, 150);

        //#So
        g2D.setColor(black);
        g2D.fillRect(475, 0, 50, 150);
        g2D.setColor(black);
        g2D.drawRect(475, 0, 50, 150);

        //#La
        g2D.setColor(black);
        g2D.fillRect(575, 0, 50, 150);
        g2D.setColor(black);
        g2D.drawRect(575, 0, 50, 150);


    }

   private class HandlerClass implements MouseListener, MouseMotionListener{

       Label l;
       HandlerClass(){
           addMouseListener(this);
           l=new Label("???????????????????????????", Label.CENTER);
           l.setBounds(25,300,700,25);

           l.setBackground(YELLOW);
           add(l);
           setSize(300,300);
           setLayout(null);
           setVisible(true);


       }


       @Override
       public void mouseClicked(MouseEvent e) {
//           System.out.print("Mouse Clicked at "+e.getX()+" "+e.getY());

           int x = e.getX();
           int y = e.getY();

            if(x>=75 && x<=125 && y>=0 && y<=150){
                System.out.println("????????????: #Do");
                l.setText("???????????????#Do, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=175 && x<=225 && y>=0 && y<=150){
                System.out.println("????????????: #Re");
                l.setText("???????????????#Re, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=375 && x<=425 && y>=0 && y<=150){
                System.out.println("????????????: #Fa");
                l.setText("???????????????#Fa, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=475 && x<=525 && y>=0 && y<=150){
                System.out.println("????????????: #So");
                l.setText("???????????????#So, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=575 && x<=625 && y>=0 && y<=150){
                System.out.println("????????????: #La");
                l.setText("???????????????#La, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=0 && x<=100 && y>=0 && y<=250){
                System.out.println("????????????: Do");
                l.setText("???????????????Do, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=100 && x<=200 && y>=0 && y<=250){
                System.out.println("????????????: Re");
                l.setText("???????????????Re, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=200 && x<=300 && y>=0 && y<=250){
                System.out.println("????????????: Me");
                l.setText("???????????????Me, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=300 && x<=400 && y>=0 && y<=250){
                System.out.println("????????????: Fa");
                l.setText("???????????????Fa, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=400 && x<=500 && y>=0 && y<=250){
                System.out.println("????????????: So");
                l.setText("???????????????So, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=500 && x<=600 && y>=0 && y<=250){
                System.out.println("????????????: La");
                l.setText("???????????????La, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=600 && x<=700 && y>=0 && y<=250){
                System.out.println("????????????: Si");
                l.setText("???????????????Si, " + "?????????("+x+"???"+y+")");
            }
            else if(x>=700 && x<=800 && y>=0 && y<=250){
                System.out.println("????????????: Do");
                l.setText("???????????????Do, " + "?????????("+x+"???"+y+")");
            }
            else{
                System.out.println("????????????: ???????????????");
                l.setText("??????????????????????????????, " + "?????????("+x+"???"+y+")");
            }

       }

       @Override
       public void mousePressed(MouseEvent e) {

       }

       @Override
       public void mouseReleased(MouseEvent e) {

       }

       @Override
       public void mouseEntered(MouseEvent e) {

       }

       @Override
       public void mouseExited(MouseEvent e) {

       }

       @Override
       public void mouseDragged(MouseEvent e) {

       }

       @Override
       public void mouseMoved(MouseEvent e) {

       }
   }
}

