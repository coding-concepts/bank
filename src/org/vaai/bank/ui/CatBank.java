package org.vaai.bank.ui;

import org.vaai.bank.data.dto.RegistrationData;
import org.vaai.bank.enums.UserType;
import org.vaai.bank.service.RegistrationValidator;
import org.vaai.bank.service.UserService;
import org.vaai.bank.service.impl.UserServiceImpl;
import org.vaai.bank.util.ServiceFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class CatBank {

    // UI Elements
    private JPanel mainPanel;
    private JRadioButton bankerRadioButton;
    private JRadioButton customerRadioButton;
    private JTextField userFullName;
    private JTextField email;
    private JPasswordField password;
    private JButton createUserButton;
    private JPasswordField confirmPassword;
    private UserType userType;


    RegistrationValidator validator = ServiceFactory.getRegistrationValidator();
    UserService userService = ServiceFactory.getUserService();


    public CatBank() {

        createUserButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewUser();
            }
        });

        bankerRadioButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                setUserType(e);
            }
        });


        customerRadioButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                setUserType(e);
            }
        });
    }

    private void setUserType(ActionEvent e) {
        //if (typer.getSelection() == bankerRadioButton){
        if (e.getActionCommand() == "Banker") {
            userType = UserType.BANKER ;
        } else {
            userType = UserType.USER  ;
        }
    }

    private void createNewUser() {

        RegistrationData regdata = new RegistrationData();
        regdata.setUserFullName(userFullName.getText());
        regdata.setEmail(email.getText());
        regdata.setPasswd(password.getText());
        regdata.setConfirmPasswd(confirmPassword.getText());
        regdata.setType(userType);

        //set data
        try {
            validator.validate(regdata);
            userService.saveUser(regdata);

            String s = UserServiceImpl.userStorage.toString();

            JOptionPane.showMessageDialog(this.mainPanel, "USer Saved :"+s );
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(mainPanel, e.getMessage());
        }
    }

    public static void main(String[] aniket) {

        JFrame jFrame = new JFrame("Cat Bank");
        jFrame.setContentPane(new CatBank().mainPanel);
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
