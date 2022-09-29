package com.omju.rickandmorty;

import static com.omju.rickandmorty.CommanderFunction.buildCommanderWithName;
import com.omju.rickandmorty.cli.CLIArguments;
import com.beust.jcommander.JCommander;

public class RickAndMortyApp {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("rick-morty", CLIArguments::newInstance);
    }
}
