package com.twu.biblioteca.requester;

import com.twu.biblioteca.command.Command;

public class Keypad {
    private Command startCommand;
    private Command exitCommand;
    private Command listCommand;
    private Command checkoutCommand;
    private Command returnbackCommand;
    private Command warnCommand;

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setExitCommand(Command exitCommand) {
        this.exitCommand = exitCommand;
    }

    public void setListCommand(Command listCommand) {
        this.listCommand = listCommand;
    }

    public void setCheckoutCommand(Command checkoutCommand) {
        this.checkoutCommand = checkoutCommand;
    }

    public void setReturnbackCommand(Command returnbackCommand) {
        this.returnbackCommand = returnbackCommand;
    }

    public void setWarnCommand(Command warnCommand) {
        this.warnCommand = warnCommand;
    }

    public void start() {
        startCommand.execute();
    }

    public void exit() {
        exitCommand.execute();
    }

    public void list() {
        listCommand.execute();
    }

    public void checkout() {
        checkoutCommand.execute();
    }

    public void returnback() {
        returnbackCommand.execute();
    }

    public void warn() {
        warnCommand.execute();
    }
}
