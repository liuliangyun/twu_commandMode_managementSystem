package com.twu.biblioteca.requester;

import com.twu.biblioteca.command.Command;

public class Keypad {
    private Command listCommand;
    private Command checkoutCommand;
    private Command returnbackCommand;
    private Command stopCommand;
    private Command warnCommand;

    public void setListCommand(Command listCommand) {
        this.listCommand = listCommand;
    }

    public void setCheckoutCommand(Command checkoutCommand) {
        this.checkoutCommand = checkoutCommand;
    }

    public void setReturnbackCommand(Command returnbackCommand) {
        this.returnbackCommand = returnbackCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void setWarnCommand(Command warnCommand) {
        this.warnCommand = warnCommand;
    }

    public void list() {
        listCommand.execute();
    }

    public void checkout(Long id) {
        checkoutCommand.execute();
    }

    public void returnback(Long id) {
        returnbackCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

    public void warn() {
        warnCommand.execute();
    }
}
