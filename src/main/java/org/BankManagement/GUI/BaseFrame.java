package org.BankManagement.GUI;

/* Base frame which will be the sample for all main pages like login
* page, employee, admin and user pages which allow different
* features for each other.
* */

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
