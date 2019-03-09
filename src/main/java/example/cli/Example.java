package example.cli;

import picocli.CommandLine;
import picocli.CommandLine.*;

import java.io.File;

@Command(name = "example", mixinStandardHelpOptions = true, version = "Picocli example 3.0")
public class Example implements Runnable {
    @Option(names = { "-v", "--verbose" }, description = "Verbose mode. Helpful for troubleshooting. " +
            "Multiple -v options increase the verbosity.")
    private boolean[] verbose = new boolean[0];

    @Parameters(arity = "1..*", paramLabel = "FILE", description = "File(s) to process.")
    private File[] inputFiles;
    
    @Override
    public void run() {
        if (verbose.length > 0) {
            System.out.println("Processing " + inputFiles.length + " files...");
        }

        if (verbose.length > 1) {
            for (File f : inputFiles) {
                System.out.println("Processing: " + f.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        CommandLine.run(new Example(), args);
    }
}
