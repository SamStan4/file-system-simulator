package com.samstanley.logic;

import java.util.Random;

import com.samstanley.logic.enums.ReplAction;

/**
 * @brief The UserInputExecutor class is the class that is actually going to conduct all logic and execute the user's input.
 */
public class UserInputExecutor {
  
  static UserInputExecutor instance;

  static {
    UserInputExecutor.instance = null;
  }

  /**
   * @brief Private constructor to enforce singleton pattern.
   */
  private UserInputExecutor() {
  }

  /**
   * @brief Gets the singleton instance.
   * @return { UserInputExecutor } The singleton instance.
   */
  public static UserInputExecutor getInstance() {
    if (UserInputExecutor.instance == null) {
      synchronized (UserInputExecutor.class) {
        if (UserInputExecutor.instance == null) {
          UserInputExecutor.instance = new UserInputExecutor();
        }
      }
    }
    return UserInputExecutor.instance;
  }

  /**
   * @brief This function executes the line of code that the user inputs.
   * @param userInput The line of commands and command arguments.
   * @return { ReplAction } Tells the REPL loop to continue or terminate.
   */
  public ReplAction execute(final String userInput) {
    System.out.println("User input: " + userInput);
    return (new Random().nextInt(10) == 1) ? ReplAction.TERMINATE : ReplAction.CONTINUE;
  }
}
