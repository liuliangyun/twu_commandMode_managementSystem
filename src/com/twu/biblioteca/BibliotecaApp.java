package com.twu.biblioteca;

import com.twu.biblioteca.command.CheckoutCommand;
import com.twu.biblioteca.command.Command;
import com.twu.biblioteca.command.ExitCommand;
import com.twu.biblioteca.command.ListCommand;
import com.twu.biblioteca.command.ReturnbackCommand;
import com.twu.biblioteca.command.StartCommand;
import com.twu.biblioteca.command.WarnCommand;
import com.twu.biblioteca.receiver.ManagementSystem;
import com.twu.biblioteca.requester.Keypad;

import java.util.Scanner;

public class BibliotecaApp {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    private void run() {
        //创建接收者对象
        ManagementSystem managementSystem = new ManagementSystem();

        //创建请求者对象
        Keypad keypad = new Keypad();

        //测试
        while (true) {
            //创建具体的命令对象，请求者发送具体的命令
            Command startComamnd = new StartCommand(managementSystem);
            keypad.setStartCommand(startComamnd);
            keypad.start();
            String input = scanner.nextLine();
            if (input.equals("0")) {
                Command exitCommand = new ExitCommand(managementSystem);
                keypad.setExitCommand(exitCommand);
                keypad.exit();
                break;
            } else if (input.equals("1")) {
                Command listCommand = new ListCommand(managementSystem);
                keypad.setListCommand(listCommand);
                keypad.list();
            } else if (input.equals("2")) {
                Command checkoutCommand = new CheckoutCommand(managementSystem, getInput());
                keypad.setCheckoutCommand(checkoutCommand);
                keypad.checkout();
            } else if (input.equals("3")) {
                Command returnbackCommand = new ReturnbackCommand(managementSystem, getInput());
                keypad.setReturnbackCommand(returnbackCommand);
                keypad.returnback();
            } else {
                Command warnCommand = new WarnCommand(managementSystem);
                keypad.setWarnCommand(warnCommand);
                keypad.warn();
            }
        }
    }

    private Long getInput() {
        System.out.print("Please enter the id.\n");
        return Long.parseLong(scanner.nextLine());
    }
}
