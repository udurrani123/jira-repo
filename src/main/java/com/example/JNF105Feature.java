// JNF-105: New feature to add two buttons for search and delete.

package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JNF105Feature {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Search and Delete Feature");
        JButton searchButton = new JButton("Search");
        JButton deleteButton = new JButton("Delete");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for search action
                System.out.println("Search button clicked");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for delete action
                System.out.println("Delete button clicked");
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(searchButton);
        frame.add(deleteButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}