package com.samstanley.logic;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @brief Test cases for the FileSystemWrapper class.
 */
public class FileSystemWrapperTest {
  
  /**
   * @brief Tests that the get instance static method works for the FileSystemWrapper class.
   */
  @Test
  @DisplayName("FileSystemWrapper.getInstance test 01")
  public void getInstanceTest01() {
    final FileSystemWrapper instance = FileSystemWrapper.getInstance();
    assertNotNull(instance);
  }

  /**
   * @brief Very simple test to see if the instances of FileSystemWrapper are the same object
   *        (memory space) over multiple calls to FileSystemWrapper.getInstance().
   */
  @Test
  @DisplayName("FileSystemWrapper.getInstance test 02")
  public void getInstanceTest02() {
    final FileSystemWrapper instance1 = FileSystemWrapper.getInstance();
    final FileSystemWrapper instance2 = FileSystemWrapper.getInstance();
    final FileSystemWrapper instance3 = FileSystemWrapper.getInstance();
    assertSame(instance1, instance2);
    assertSame(instance2, instance3);
    assertSame(instance1, instance3);
  }
}