package com.app.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnotherAnnotation {
   // test case 1
   @Test
   public void testCase1() {
      System.out.println("inside AnotherAnnotation -  test case 1");
   }

   // test case 2
   @Test
   public void testCase2() {
      System.out.println("inside AnotherAnnotation - test case 2");
   }

   @BeforeMethod
   public void beforeMethod() {
      System.out.println("inside AnotherAnnotation - beforeMethod");
   }

   @AfterMethod
   public void afterMethod() {
      System.out.println("inside AnotherAnnotation - afterMethod");
   }

   @BeforeClass
   public void beforeClass() {
      System.out.println("inside AnotherAnnotation - beforeClass");
   }

   @AfterClass
   public void afterClass() {
      System.out.println("inside AnotherAnnotation - afterClass");
   }

   @BeforeTest
   public void beforeTest() {
      System.out.println("inside AnotherAnnotation - beforeTest");
   }

   @AfterTest
   public void afterTest() {
      System.out.println("inside AnotherAnnotation - afterTest");
   }

   @BeforeSuite
   public void beforeSuite() {
      System.out.println("inside AnotherAnnotation - beforeSuite");
   }

   @AfterSuite
   public void afterSuite() {
      System.out.println("inside AnotherAnnotation - afterSuite");
   }
}