import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// Part A — File Setup
try {
// A1: Create a File object for "grades.txt"
File file = new File("grades.txt");
// Part B — Reading from the File
// B1: Create a Scanner to read the file
Scanner input = new Scanner(file);
// B2: Print "Student Grades:"
System.out.println("Students summer grades:");
// B3: Read and print each line from the file
while (input.hasNextLine()) {
String line = input.nextLine();
System.out.println(line);
}
// Close the Scanner
input.close();
}
catch (FileNotFoundException e) {
// Part C — Exception Handling
// C1 & C2: Print message if file is missing
System.out.println("File not found!");
}
}
}
