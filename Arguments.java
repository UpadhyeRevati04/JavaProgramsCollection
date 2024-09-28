import java.lang.*;

class Arguments {
	 public static void main(String[] args) {
 	 for(String t: args) {
 		System.out.println(t);
 	}
 	}
}

/* the command line arguments passed from the console can be received in the Java program and they can be used as input. This code will accept command line arguments and will display them on each line.

step 1. javac Arguments.java
step 2. java Arguments COMMAND-LINE ARGUMENTS
*/