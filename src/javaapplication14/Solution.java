/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author LENOVO
 */
public class Solution {
  public static int century(int number) {
    return number % 100 == 0? number / 100 : (number / 100) + 1;
  }
}