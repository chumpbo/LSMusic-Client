package View;

import javax.swing.*;

public class MainWindow extends JFrame {

    private LoginPanel loginPanel;
    private RegisterPanel registerPanel;

    public MainWindow(){
        //settings principals
        setSize(960,540);
        setTitle("LaSalleMusic");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //initzialitzem tots els panels
        loginPanel = new LoginPanel();
        registerPanel = new RegisterPanel();
        //el primer panel per default es el de login
        setContentPane(loginPanel.getMain_panel());

    }

    public void switchPanel(String panel_name){
        //aquesta funcio es crida quan es necessita canviar a un altre panel segons el String rebut
        switch(panel_name){
            case "register":
                setContentPane(registerPanel.getMain_panel());
                revalidate();
                break;
            case "login":
                setContentPane(loginPanel.getMain_panel());
                revalidate();
                break;
        }
    }

    public void showError(String message){
        JOptionPane.showMessageDialog(null,message,"Error",JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccess(String message){
        JOptionPane.showMessageDialog(null,message);
    }

    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public RegisterPanel getRegisterPanel() {
        return registerPanel;
    }



}