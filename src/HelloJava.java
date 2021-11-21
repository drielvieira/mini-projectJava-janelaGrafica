import javax.swing.*;

    public class HelloJava {
        public static void main(String[] args) {
            /*OBJETO JFRAME CRIA UMA JANELA GRAFICA
             * OBJETO JLABEL EXIBER UM TEXTO CENTRALIZADO NA TELA
             * METODO setSize()
             * METODO setVisible
             * METODO add()*/
            JFrame frame = new JFrame("Janela grafica do java");
            JLabel label = new JLabel("Hello, java!!", JLabel.CENTER);
            frame.add(label);
            frame.setSize(300,300);
            frame.setVisible(true);
        }
    }


