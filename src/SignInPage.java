import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInPage extends JFrame implements ActionListener {

    AdminSignInPage adminSignInPage = new AdminSignInPage();

    private javax.swing.JPanel SignInBox;
    private javax.swing.JPanel SignInWindow;
    private javax.swing.JButton admButton;
    private javax.swing.JPanel buttonBox;
    private javax.swing.JPanel icon;
    private javax.swing.JButton studButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JPanel titleBox;


    public SignInPage() {
        setSize(686, 429);
        DefaultWindowSettings.apply(this);
        initComponents();
        getContentPane().add(SignInWindow );
        admButton.addActionListener(this);
        }
        private void initComponents () {

            SignInWindow = new javax.swing.JPanel();
            SignInBox = new javax.swing.JPanel();
            titleBox = new javax.swing.JPanel();
            title = new javax.swing.JLabel();
            title1 = new javax.swing.JLabel();
            icon = new javax.swing.JPanel();
            buttonBox = new javax.swing.JPanel();
            studButton = new javax.swing.JButton();
            admButton = new javax.swing.JButton();

            SignInWindow.setBackground(new java.awt.Color(0, 51, 102));

            SignInBox.setBackground(new java.awt.Color(255, 255, 255));

            titleBox.setBackground(new java.awt.Color(255, 255, 255));
            titleBox.setLayout(new java.awt.BorderLayout());

            title.setBackground(new java.awt.Color(255, 255, 255));
            title.setFont(new java.awt.Font("MS Gothic", 0, 12)); // NOI18N
            title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            title.setText("CLIRDEC LIBRARY SYSTEM");
            title.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
           // title.setName("CLIRDEC LIBRARY SYSTEM"); // NOI18N
            titleBox.add(title, java.awt.BorderLayout.CENTER);

            title1.setBackground(new java.awt.Color(255, 255, 255));
            title1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
            title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            title1.setText("SIGN IN");
            title1.setToolTipText("");
            title1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            title1.setName("CLIRDEC LIBRARY SYSTEM"); // NOI18N
            titleBox.add(title1, java.awt.BorderLayout.PAGE_END);

            icon.setBackground(new java.awt.Color(255, 255, 255));


            javax.swing.GroupLayout iconLayout = new javax.swing.GroupLayout(icon);
            icon.setLayout(iconLayout);
            iconLayout.setHorizontalGroup(
                    iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 212, Short.MAX_VALUE)
            );
            iconLayout.setVerticalGroup(
                    iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 0, Short.MAX_VALUE)
            );

            titleBox.add(icon, java.awt.BorderLayout.PAGE_START);

            buttonBox.setBackground(new java.awt.Color(204, 204, 204));

            studButton.setBackground(new java.awt.Color(0, 51, 102));
            studButton.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
            studButton.setForeground(new java.awt.Color(255, 255, 255));
            studButton.setText("Student");
            studButton.setBorder(null);
            studButton.setMaximumSize(new java.awt.Dimension(60, 25));
            studButton.setMinimumSize(new java.awt.Dimension(60, 25));

            admButton.setBackground(new java.awt.Color(0, 51, 102));
            admButton.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
            admButton.setForeground(new java.awt.Color(255, 255, 255));
            admButton.setText("Admin");
            admButton.setBorder(null);
            admButton.setMaximumSize(new java.awt.Dimension(60, 25));
            admButton.setMinimumSize(new java.awt.Dimension(60, 25));


            javax.swing.GroupLayout buttonBoxLayout = new javax.swing.GroupLayout(buttonBox);
            buttonBox.setLayout(buttonBoxLayout);
            buttonBoxLayout.setHorizontalGroup(buttonBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonBoxLayout.createSequentialGroup()
                            .addGap(51, 51, 51)
                                    .addGroup(buttonBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(admButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(studButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

            buttonBoxLayout.setVerticalGroup(buttonBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonBoxLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(studButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(admButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(61, Short.MAX_VALUE)));

            javax.swing.GroupLayout SignInBoxLayout = new javax.swing.GroupLayout(SignInBox);
            SignInBox.setLayout(SignInBoxLayout);
            SignInBoxLayout.setHorizontalGroup(SignInBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

            SignInBoxLayout.setVerticalGroup(SignInBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInBoxLayout.createSequentialGroup()
                                    .addComponent(titleBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

            javax.swing.GroupLayout SignInWindowLayout = new javax.swing.GroupLayout(SignInWindow);
            SignInWindow.setLayout(SignInWindowLayout);
            SignInWindowLayout.setHorizontalGroup(SignInWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignInWindowLayout.createSequentialGroup()
                                    .addGap(237, 237, 237)
                                    .addComponent(SignInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(237, Short.MAX_VALUE)));
            SignInWindowLayout.setVerticalGroup(SignInWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SignInWindowLayout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(SignInBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(139, Short.MAX_VALUE)));



        }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == admButton) dispose();
        adminSignInPage.setVisible(true);
    }
}










