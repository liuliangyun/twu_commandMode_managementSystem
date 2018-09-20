package com.twu.biblioteca.command;

import com.twu.biblioteca.receiver.ManagementSystem;

public class WarnCommand implements Command {
    private ManagementSystem managementSystem;

    public WarnCommand(ManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }

    @Override
    public void execute() {
        managementSystem.warn();
    }
}
