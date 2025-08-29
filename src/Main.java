import javax.swing.*;

public class Main{
    public static void main(String[] args){
    String adminPass = "Password";

        SwingUtilities.invokeLater(() -> {
            SignInPage signInPage = new SignInPage();
            signInPage.setVisible(true);
        });

       /* SwingUtilities.invokeLater(() ->{
            AdminSignInPage adminSignInPage = new AdminSignInPage();
            adminSignInPage.setVisible(true);
        });*/
    }
}
