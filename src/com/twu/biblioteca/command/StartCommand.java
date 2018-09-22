package com.twu.biblioteca.command;

import com.twu.biblioteca.receiver.ManagementSystem;

public class StartCommand implements Command {
    private ManagementSystem managementSystem;

    public StartCommand(ManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }

    @Override
    public void execute() {
        managementSystem.start();
    }
}
