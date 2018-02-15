package ee.tlu.kodasma.klassikomplekt;
import javax.swing.*;
import java.awt.*;
public class Proov4 extends JPanel{
    Pallivise mang=new Pallivise();
    public Proov4(){
        mang.alusta();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(
                (int)(mang.lendaja.getX()-mang.lendaja.getR()),
                (int)(mang.lendaja.getY()-mang.lendaja.getR()),
                (int)(2*mang.lendaja.getR()),
                (int)(2*mang.lendaja.getR()));
    
        g.fillOval(
                (int)(mang.sihtkoht.getX()-mang.sihtkoht.getR()),
                (int)(mang.sihtkoht.getY()-mang.sihtkoht.getR()),
                (int)(2*mang.sihtkoht.getR()),
                (int)(2*mang.sihtkoht.getR()));
    }
    public static void main(String[] arg){
        JFrame f=new JFrame("Pallimäng");
        f.getContentPane().add(new Proov4());
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
