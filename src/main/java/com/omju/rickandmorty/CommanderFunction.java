package com.omju.rickandmorty;

import com.beust.jcommander.ParameterException;
import com.beust.jcommander.JCommander;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Optional;
import java.util.List;

public class CommanderFunction {
    static <T> JCommander buildCommanderWithName(String name, Supplier<Object> argumentSupplier) {
        JCommander jCommander = JCommander.newBuilder().addObject(argumentSupplier.get()).build();
        jCommander.setProgramName(name);

        return jCommander;
    }

    static Optional<List<Object>> parseArguments(JCommander jCommander, String[] args, Consumer<JCommander> onError) {
        try {
            jCommander.parse(args);
            return Optional.of(jCommander.getObjects());
        } catch (ParameterException pe) {
            onError.accept(jCommander);
        }

        return Optional.empty();
    }
}
