package com.samstanley.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @brief Test cases for the UserInputExecutor class.
 */
public class UserInputExecutorTest {
  
  /**
   * @brief Tests that the get instance static method works for the FileSystemWrapper class.
   */
  @Test
  @DisplayName("UserInputExecutor.getInstance test 01")
  public void getInstanceTest01() {
    final UserInputExecutor instance = UserInputExecutor.getInstance();
    assertNotNull(instance);
  }

  /**
   * @brief Very simple test to see if the instances of UserInputExecutor are the same object
   *        (memory space) over multiple calls to UserInputExecutor.getInstance().
   */
  @Test
  @DisplayName("FileSystemWrapper.getInstance test 02")
  public void getInstanceTest02() {
    final UserInputExecutor instance1 = UserInputExecutor.getInstance();
    final UserInputExecutor instance2 = UserInputExecutor.getInstance();
    final UserInputExecutor instance3 = UserInputExecutor.getInstance();

    assertSame(instance1, instance2);
    assertSame(instance2, instance3);
    assertSame(instance1, instance3);

    assertEquals(instance1.hashCode(), instance2.hashCode());
    assertEquals(instance2.hashCode(), instance3.hashCode());
    assertEquals(instance1.hashCode(), instance3.hashCode());
  }
}
