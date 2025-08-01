package com.samstanley;

import com.samstanley.logic.FileSystemWrapper;

public class App {
public static void main(String[] args) {
    FileSystemWrapper
      .getInstance()
      .runFileSystemREPL();
  }
}
