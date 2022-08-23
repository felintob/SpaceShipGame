package meujogo;

import javax.swing.JFrame;

public class Container extends JFrame{

    public Container(){
        add(new Fase());
        setTitle("Meu Jogo");
        setSize(1024,728);
        setDefaultCloseOparation(JFrame.EXIT_ON_CLOSE);
        setLocationRelative(null);
        this.setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args){
        new Container();
    }
}