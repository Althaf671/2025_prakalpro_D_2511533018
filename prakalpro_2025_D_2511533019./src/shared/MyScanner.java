package shared;

import java.util.Scanner;

public class MyScanner {
    private Scanner scanner;

    public MyScanner() {
        this.scanner = new Scanner(System.in);
    }
    
    public void nextLine() {
    	scanner.nextLine();
    }

    public String nextString(String msg) {
        System.out.print(msg + ": ");
        return scanner.nextLine();
    }

    public int nextInt(String msg) {
        System.out.print(msg + ": ");
        return scanner.nextInt();
    }

    public boolean nextBool(String msg) {
        System.out.print(msg + ": ");
        return scanner.nextBoolean();
    }

    public double nextDouble(String msg) {
        System.out.print(msg + ": ");
        return scanner.nextDouble();
    }
    
    public char nextChar(String msg) {
    	System.out.print(msg + ": "); 
    	return scanner.next().charAt(0);
    }
    
    public void closeScanner() {
    	scanner.close();
    }
}