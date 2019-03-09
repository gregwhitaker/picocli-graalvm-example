# picocli-graalvm-example
An example of how to compile a [picocli](https://picocli.info/) application into a native image using [GraalVM](https://www.graalvm.org).

## Prerequisites
This example requires that you have [GraalVM](https://www.graalvm.org/downloads/) installed on your system.

## Building the Example
Follow the steps below to build the example:

1. Build the application by running the following command:

        ./gradlew clean nativeImage
        
    If successful, you will see an output similar to the one below:

        > Task :nativeImage
        [picocli-graalvm-example-0.1.0-all:79330]    classlist:   1,591.86 ms
        [picocli-graalvm-example-0.1.0-all:79330]        (cap):   1,333.19 ms
        [picocli-graalvm-example-0.1.0-all:79330]        setup:   2,752.30 ms
        [picocli-graalvm-example-0.1.0-all:79330]   (typeflow):   9,171.43 ms
        [picocli-graalvm-example-0.1.0-all:79330]    (objects):  11,283.86 ms
        [picocli-graalvm-example-0.1.0-all:79330]   (features):     366.95 ms
        [picocli-graalvm-example-0.1.0-all:79330]     analysis:  21,281.39 ms
        [picocli-graalvm-example-0.1.0-all:79330]     universe:     722.37 ms
        [picocli-graalvm-example-0.1.0-all:79330]      (parse):   1,887.22 ms
        [picocli-graalvm-example-0.1.0-all:79330]     (inline):   3,982.18 ms
        [picocli-graalvm-example-0.1.0-all:79330]    (compile):  30,374.73 ms
        [picocli-graalvm-example-0.1.0-all:79330]      compile:  37,433.35 ms
        [picocli-graalvm-example-0.1.0-all:79330]        image:   2,968.30 ms
        [picocli-graalvm-example-0.1.0-all:79330]        write:     803.57 ms
        [picocli-graalvm-example-0.1.0-all:79330]      [total]:  67,726.48 ms
        
        BUILD SUCCESSFUL in 1m 10s
        6 actionable tasks: 6 executed

## Running the Example
Follow the steps below to run the example:

1. Run the following command to display the command usage:

        ./picocli-graalvm-example-0.1.0-all -h
        
    If successful, you will an output similar to the one below:
    
        Usage: example [-hV] [-v]... FILE...
              FILE...     File(s) to process.
          -h, --help      Show this help message and exit.
          -v, --verbose   Verbose mode. Helpful for troubleshooting. Multiple -v options
                            increase the verbosity.
          -V, --version   Print version information and exit.

2. Run the following command to process files:

        ./picocli-graalvm-example-0.1.0-all -vv input.dat input2.dat
        
    If successful, you will see an output similar to the one below:

        Processing 2 files...
        Processing: /Users/greg/workspace/picocli-graalvm-example/test.dat
        Processing: /Users/greg/workspace/picocli-graalvm-example/test1.dat

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/picocli-graalvm-example/issues).

## Resources

1. [PicoCLI Code Generation](https://github.com/remkop/picocli/tree/master/picocli-codegen)
2. [PicoCLI on GraalVM](https://picocli.info/picocli-on-graalvm.html)

## License
MIT License

Copyright (c) 2019 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.