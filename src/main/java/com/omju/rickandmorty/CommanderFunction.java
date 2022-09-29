package com.omju.rickandmorty;

import com.beust.jcommander.JCommander;
import java.util.function.Supplier;

public class CommanderFunction {
    static <T> JCommander buildCommanderWithName(String name, Supplier<Object> argumentSupplier) {
        JCommander jCommander = JCommander.newBuilder().addCommand(argumentSupplier.get()).build();
        jCommander.setProgramName(name);

        return jCommander;
    }
}
