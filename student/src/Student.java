import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField Name;
    private JTextField m1;
    private JTextField m2;
    private JTextField m3;
    private JTextField total;
    private JTextField avg1;
    private JButton calButton;
    private JTextField grade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student()
    {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int M1,M2,M3,tot;
                double avg;


                M1 = Integer.parseInt(m1.getText());
                M2 = Integer.parseInt(m2.getText());
                M3 = Integer.parseInt(m3.getText());

                tot = M1+M2+M3;
                total.setText(String.valueOf(tot));

                avg = tot/3;
                avg1.setText(String.valueOf(avg));

                if(avg > 50)
                {
                    grade.setText("Pass");
                }
                else {
                    grade.setText("FailA");
                }


            }
        });
    }
}
