package com.omju.rickandmorty.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    @Parameter(required = true, descriptionKey = "KEYWORD", description = "KEYWORD", validateWith = CLIKeywordValidator.class)
    private String keyword;

    @Parameter(names = {"--location", "-l"}, description = "The search can include a location")
    private String location;

    @Parameter(names = {"--page", "-p"}, description = "The number of page to search")
    private int page = 0;

    @Parameter(names = {"--alive", "-a"}, description = "Search the alive characters")
    private boolean isAlive = false;

    @Parameter(names = {"--markdown", "-m"}, description = "Return the results in Markdown format")
    private boolean isMarkdown = false;

    @Parameter(names = {"--help", "-h"}, description = "Show the help about the command", help = true, validateWith = CLIHelpValidator.class)
    private boolean isHelp;

    public CLIArguments() {}

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isAlive=" + isAlive +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}