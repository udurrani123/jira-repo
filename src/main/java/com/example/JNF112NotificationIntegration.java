import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JNF112NotificationIntegration {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Notification System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton assignDeadlineButton = new JButton("Set Assignment Deadline");
        JButton importantAnnouncementButton = new JButton("Post Important Announcement");

        assignDeadlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for setting assignment deadline
                JOptionPane.showMessageDialog(frame, "Assignment deadline set!");
            }
        });

        importantAnnouncementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for posting announcement
                JOptionPane.showMessageDialog(frame, "Announcement posted!");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(assignDeadlineButton);
        panel.add(importantAnnouncementButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}