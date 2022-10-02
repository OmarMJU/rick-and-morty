package com.omju.rickandmorty;

import static com.omju.rickandmorty.CommanderFunction.buildCommanderWithName;
import static com.omju.rickandmorty.CommanderFunction.parseArguments;
import static com.omju.rickandmorty.api.APIFunctions.buildAPI;
import com.omju.rickandmorty.api.ApiRickMorty;
import com.omju.rickandmorty.cli.CLIArguments;
import com.omju.rickandmorty.cli.CLIFunctions;
import com.beust.jcommander.JCommander;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.Collection;
import java.util.Optional;
import java.util.Map;

public class RickAndMortyApp {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("rick-morty", CLIArguments::newInstance);
        Stream<CLIArguments> streamOfCLI = parseArguments(jCommander, args, JCommander::usage).orElse(Collections.emptyList()).stream().map(obj -> (CLIArguments) obj);
        Optional<CLIArguments> cliArgumentsOptional = streamOfCLI.filter(cli -> !cli.isHelp()).filter(cli -> cli.getKeyword() != null).findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap).map(RickAndMortyApp::executeRequest).orElse(Stream.empty()).forEach(System.out::println);
    }

    private static Stream<Characters> executeRequest(Map<String, Object> params) {
        ApiRickMorty api = buildAPI(ApiRickMorty.class, "https://rickandmortyapi.com/api/");
        return Stream.of(params).map(api::rickMortyCharacters).flatMap(Collection::stream);
    }
}
