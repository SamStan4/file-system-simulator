package com.samstanley.logic;

import java.util.Scanner;

public class FileSystemWrapper {

    public static FileSystemWrapper instance;

    static {
        FileSystemWrapper.instance = null;
    }

    /**
     * @brief Private constructor for singleton pattern.
     */
    private FileSystemWrapper() {
    }

    /**
     * @brief Singleton instance getter for the FileSystemWrapper class.
     * @return { FileSystemWrapper } The singleton instance.
     */
    public static FileSystemWrapper getInstance() {
        if (FileSystemWrapper.instance == null) {
            synchronized (FileSystemWrapper.class) {
                if (FileSystemWrapper.instance == null) {
                    FileSystemWrapper.instance = new FileSystemWrapper();
                }
            }
        }
        return FileSystemWrapper.instance;
    }

    /**
     * @brief Runs the file system read, evaluate, print, loop.
     */
    public void runFileSystemREPL() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i++ < 1000) {
            System.out.print("$ ");
            String input = scanner.nextLine();
            System.out.println("Here is what you said: " + input);
        }
        scanner.close();
    }
}
