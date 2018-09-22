package com.twu.biblioteca.command;

import com.twu.biblioteca.receiver.ManagementSystem;

//具体命令角色类
public class CheckoutCommand implements Command {
    private ManagementSystem managementSystem;
    private Long id;//借书的id

    public CheckoutCommand(ManagementSystem managementSystem, Long id) {
        this.managementSystem = managementSystem;
        this.id = id;
    }

    @Override
    public void execute() {
        managementSystem.checkout(id);
    }
}
