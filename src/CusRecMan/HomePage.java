package CusRecMan;

import javax.swing.*;

public class HomePage extends JFrame {

    public HomePage() {
        setTitle("Customer Record Management");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnCustomer = new JButton("Welcome, Click Me!");
        btnCustomer.setBounds(200, 100, 200, 50);
        add(btnCustomer);

        btnCustomer.addActionListener(e -> {
            CustomerForm cf = new CustomerForm();
            cf.setVisible(true);
            this.dispose();
        });
    }
}