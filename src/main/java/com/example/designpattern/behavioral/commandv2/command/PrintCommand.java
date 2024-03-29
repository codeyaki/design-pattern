package com.example.designpattern.behavioral.commandv2.command;

import com.example.designpattern.behavioral.commandv2.command.Command;

public class PrintCommand implements Command {
    private String content;

    public PrintCommand(String content) {
        this.content = content;
    }

    @Override
    public void run() {
        System.out.println(content);
    }
}
