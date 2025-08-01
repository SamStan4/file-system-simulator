package com.samstanley.logic;

import java.util.Scanner;

import com.samstanley.logic.enums.ReplAction;

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

    ReplAction action = null;

    do {
      System.out.print("$ ");
      action = UserInputExecutor
        .getInstance()
        .execute(scanner.nextLine());
    } while (action != ReplAction.TERMINATE);

    scanner.close();
  }
}
