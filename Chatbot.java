import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chatbot extends Frame implements ActionListener {

    private TextField inputField;
    private TextArea chatArea;

    public Chatbot() {
        setTitle("Java Chatbot");
        setSize(400, 400);

        Panel chatPanel = new Panel(new BorderLayout());

        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatPanel.add(chatArea, BorderLayout.CENTER);

        Panel inputPanel = new Panel(new BorderLayout());
        inputField = new TextField();
        inputField.addActionListener(this);
        inputPanel.add(inputField, BorderLayout.CENTER);

        Button sendButton = new Button("Send");
        sendButton.addActionListener(this);
        inputPanel.add(sendButton, BorderLayout.EAST);

        chatPanel.add(inputPanel, BorderLayout.SOUTH);

        add(chatPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String userInput = inputField.getText();
        inputField.setText(""); // Clear input field

        String botResponse = generateResponse(userInput);
        displayMessage("You: " + userInput);
        displayMessage("Bot: " + botResponse);
    }

    private String generateResponse(String input) {
        // Simple rule-based responses
        if (input.toLowerCase().contains("hello")) 
        {
            return "Hello! there. Have a cherrish morning Nandu Sasapu";
        } 
        else if (input.toLowerCase().contains("how are you doing?"))
        {
            return "I'm doing great and I'm just a chatbot. However it's fine. I'm pretty much cool";
        }
        else if(input.toLowerCase().contains("what are your plans today?"))
        {
            return "There is no certain plans to do,as usual giving interested outcomes to end users based on their promopts.Anyways Thanks for asking dear Nandu";    
        }
        else if (input.toLowerCase().contains("Sounds Good! Ok we will catch up later See you."))
        {
            return "Goodbye! Have a great day!";
        } 
        else 
        {
            return "I'm sorry, I didn't understand that.Can you repeat once more?";
        }
    }

    private void displayMessage(String message) {
        chatArea.append(message + "\n");
    }

    public static void main(String[] args) {
        new Chatbot();
    }
}
