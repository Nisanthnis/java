import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sampleform {
    
    sampleform(){
        Frame frame=new Frame("Form");

        Label email=new Label("Email");
        email.setBounds(50,130,100,35);
        TextField emailTextField=new TextField("Enter your email");
        emailTextField.setBounds(160,130,150,35);

        Label password=new Label("Password");
        password.setBounds(50,170,100,35);
        TextField passwordTextField=new TextField("Enter your password");
        passwordTextField.setBounds(160,170,150,35);

        Label age=new Label("Age");
        age.setBounds(50,210,100,35);
        TextField ageTextField=new TextField("Enter your age");
        ageTextField.setBounds(160,210,150,35);

        Button submit=new Button("Submit");
        submit.setBounds(115,250,50,30);

        // ActionListener submActionListener=new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
        //         System.out.println(emailTextField.getText());
        //         System.out.println(passwordTextField.getText());
        //         System.out.println(ageTextField.getText());
        //     }
        // };

        


        foractionlistner fac=new foractionlistner(emailTextField, passwordTextField, ageTextField);
        submit.addActionListener(fac);


        frame.add(email);
        frame.add(password);
        frame.add(age);
        frame.add(emailTextField);
        frame.add(passwordTextField);
        frame.add(ageTextField);
        frame.add(submit);
        


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
    
    public static void main(String[] args) {
        new sampleform();
    }
}

class foractionlistner implements ActionListener{

    TextField emailTextField;
    TextField passwordTextField;
    TextField ageTextField;

    foractionlistner(TextField emailTextField,TextField passwordTextField, TextField ageTextField){
        this.emailTextField=emailTextField;
        this.passwordTextField=passwordTextField;
        this.ageTextField=ageTextField;
    }

    public void actionPerformed(ActionEvent e){
           System.out.println(emailTextField.getText());
            System.out.println(passwordTextField.getText());
            System.out.println(ageTextField.getText());
    }
}

