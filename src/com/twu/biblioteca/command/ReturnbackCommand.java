package com.twu.biblioteca.command;

import com.twu.biblioteca.receiver.ManagementSystem;

//具体命令角色类
public class ReturnbackCommand implements Command{
    private ManagementSystem managementSystem;
    private Long id;

    public ReturnbackCommand(ManagementSystem managementSystem, Long id) {
        this.managementSystem = managementSystem;
        this.id = id;
    }

    @Override
    public void execute() {
        managementSystem.returnback(id);
    }
}
