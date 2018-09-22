package com.twu.biblioteca.command;

import com.twu.biblioteca.receiver.ManagementSystem;

//具体命令角色类
public class ExitCommand implements Command {
    private ManagementSystem managementSystem;

    public ExitCommand(ManagementSystem managementSystem) {
        this.managementSystem = managementSystem;
    }

    @Override
    public void execute() {
        managementSystem.exit();
    }
}
