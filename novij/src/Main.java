import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {

    private JPanel JForma;
    private JLabel Sveiciens;
    private JLabel EnterName;
    private JTextField EnterYourName;
    private  JButton Ready;
    private JLabel SelectCountry;
    private JComboBox<String> selectCountry;

    Main(){
        setContentPane(JForma);
        setTitle("Registracija Veikala");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        selectCountry.addItem("Latvija");
        selectCountry.addItem("Igaunija");
        selectCountry.addItem("Lietuva");
        selectCountry.addItem("Polija");
        selectCountry.addItem("Vācija");




        Ready.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name =  EnterYourName.getName();
                String country =(String) selectCountry.getSelectedItem();





                User u1 = new User(name, country);
                ClothingStore c1 = new ClothingStore();

                u1.printInfo();
                c1.showMenu(u1);




            }
        });

    }





    public static void main(String[] args) {

        new Main();

    }
}