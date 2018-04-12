package lab3;
        import java.applet.*;
        import javax.swing.*;
        import java.awt.*;

public class SpringApplet extends JApplet {
    public int wide = 600;
    public int height = 600;
    public void init() {
        //Zdefiniowanie wymiarów okna oraz ustawienie jako widoczne
        setSize(wide, height);
        setVisible(true);
    }
    public void paint(Graphics g) {
        //Utworzenie nowych obiektów klasy Vector2D przy pomocy konstruktorów, a następnie przez odpowiednie
        //metody - dodawanie/odejmowanie/mnozenie juz istniejacych wektorow.
        Vector2D vector1 = new Vector2D(-6, 4);
        Vector2D vector2 = new Vector2D(3,-3);
        Vector2D vector1sum = vector1.sumaWektorow(3, 4);
        Vector2D vector2sum = vector2.sumaWektorow(2, 4);
        Vector2D vector1roz = vector1.roznicaWektorow(1, 2);
        Vector2D vector2roz = vector2.roznicaWektorow(5, 3);
        Vector2D vector1znorm = vector1.wektorZnormalizowany();
        Vector2D vector2znorm = vector2.wektorZnormalizowany();

        //Obliczenie długości wszystkich wektorów
        double dlugosc1 = vector1.dlugoscWektora();
        double dlugosc2 = vector2.dlugoscWektora();
        double dlugosc1sum = vector1sum.dlugoscWektora();
        double dlugosc2sum = vector2sum.dlugoscWektora();
        double dlugosc1roz = vector1roz.dlugoscWektora();
        double dlugosc2roz = vector2roz.dlugoscWektora();

        Vector2D vector1mnoz = vector1.mnozenieWektorow(2,8);

        //Wypisanie podstawowych informacji o wszystkich wektorach
        System.out.println("Wektor 1:\n" + "x: " + vector1.x + "\ny: " + vector1.y + "\n" + "Długość: " + dlugosc1 + "\n");
        System.out.println("Wektor 2:\n" + "x: " + vector2.x + "\ny: " + vector2.y + "\n" + "Długość: " + dlugosc2 + "\n");
        System.out.println("Wektor 1 po dodawaniu:\n" + "x: " + vector1sum.x + "\ny: " + vector1sum.y + "\n" + "Długość: " + dlugosc1sum + "\n");
        System.out.println("Wektor 2 po dodawaniu:\n" + "x: " + vector2sum.x + "\ny: " + vector2sum.y + "\n" + "Długość: " + dlugosc1sum + "\n");
        System.out.println("Wektor 1 po odejmowaniu:\n" + "x: " + vector1roz.x + "\ny: " + vector1roz.y + "\n" + "Długość: " + dlugosc1roz + "\n");
        System.out.println("Wektor 2 po odejmowaniu:\n" + "x: " + vector2roz.x + "\ny: " + vector2roz.y + "\n" + "Długość: " + dlugosc1roz + "\n");
        System.out.println("Wektor 1 znormalizowany:\n" + "x: " + vector1znorm.x + "\ny: " + vector1znorm.y + "\n" + "Długość: 1" + "\n");
        System.out.println("Wektor 2 znormalizowany:\n" + "x: " + vector2znorm.x + "\ny: " + vector2znorm.y + "\n" + "Dlugosc: 1" + "\n");



        g.translate (wide/2, height/2);
        g.drawLine( -wide/2, 0, wide/2, 0 );
        g.drawLine( 0, -height/2, 0, height/2 );
        g.drawString("x",wide/2-10,10);
        g.drawString("y",10,-(wide/2-10));


        int k=28; //skala powiekszajaca wektory
        g.setColor(Color.RED);
        g.drawLine(0,0,(int)vector1.x*k,-(int)vector1.y*k);
        g.drawString("Wektor 1: ("+vector1.x+"; "+vector1.y+")",(int)vector1.x*k,-(int)vector1.y*k);
        g.setColor(Color.GREEN);
        g.drawLine(0,0,(int)vector2.x*k,-(int)vector2.y*k);
        g.drawString("Wektor 2: ("+vector2.x+"; "+vector2.y+")",(int)vector2.x*k,-(int)vector2.y*k);
        g.setColor(Color.MAGENTA);
        g.drawLine(0,0,(int)vector1sum.x*k,-(int)vector1sum.y*k);
        g.drawString("Wektor 1 po dodawaniu: ("+vector1sum.x+"; "+vector1sum.y+")",(int)vector1sum.x*k,-(int)vector1sum.y*k);
        g.setColor(Color.GRAY);
        g.drawLine(0,0,(int)vector2sum.x*k,-(int)vector2sum.y*k);
        g.drawString("Wektor 2 po dodawniu: ("+vector2sum.x+"; "+vector2sum.y+")",(int)vector2sum.x*k,-(int)vector2sum.y*k);
        g.drawLine(0,0,(int)vector1roz.x*k,-(int)vector1roz.y*k);
        g.setColor(Color.ORANGE);
        g.drawString("Wektor 1 po odejmowaniu: ("+vector1roz.x+"; "+vector1roz.y+")",(int)vector1roz.x*k,-(int)vector1roz.y*k);
        g.setColor(Color.BLUE);
        g.drawLine(0,0,(int)vector2roz.x*k,-(int)vector2roz.y*k);
        g.drawString("Wektor 2 po odejmowaniu: ("+vector2roz.x+"; "+vector2roz.y+")",(int)vector2roz.x*k,-(int)vector2roz.y*k);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(0,0,(int)vector1znorm.x*k,-(int)vector1znorm.y*k);
        g.drawString("Wektor 1 znormalizowany: ("+vector1znorm.x+"; "+vector1znorm.y+")",(int)vector1znorm.x*k,-(int)vector1znorm.y*k);
        g.setColor(Color.PINK);
        g.drawLine(0,0,(int)vector2znorm.x*k,-(int)vector2znorm.y*k);
        g.drawString("Wektor 2 znormalizowany: ("+vector2znorm.x+"; "+vector2znorm.y+")",(int)vector2znorm.x*k,-(int)vector2znorm.y*k);
    }
    public void init(int a){}
    public void paint(Graphics g, int b){}
    public static void main(String[] args) { }
}