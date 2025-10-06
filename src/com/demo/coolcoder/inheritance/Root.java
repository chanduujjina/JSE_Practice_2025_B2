/*
 * package com.demo.coolcoder.inheritance;
 * 
 * public interface Root { void m1();// design
 * 
 * default void m2() {
 * 
 * }
 * 
 * static void m4() {
 * 
 * } }
 * 
 * interface Root1 { void m1();// design
 * 
 * default void m3() {
 * 
 * }
 * 
 * default void m4() {
 * 
 * } }
 * 
 * class Derived implements Root,Root1{
 * 
 * @Override public void m1() { System.out.println("inside Derived m1()"); }
 * 
 * @Override public void m4() {
 * 
 * }
 * 
 * 
 * }
 */