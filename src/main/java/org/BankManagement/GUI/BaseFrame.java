package org.BankManagement.GUI;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        initialize(title);
    }

    private void initialize(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(580, 600);
        setLocationRelativeTo(null);
        addGuiElements();
    }

    protected abstract void addGuiElements();
}
