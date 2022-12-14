package com.omju.rickandmorty.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments) {
        Map<String, Object> params = new HashMap<>();

        params.put("id", cliArguments.getKeyword());
        params.put("location", cliArguments.getLocation());
        params.put("page", cliArguments.getPage());
        params.put("isAlive", cliArguments.isAlive());

        if (cliArguments.isMarkdown()) {
            params.put("markdown", true);
        }

        return params;
    }
}
