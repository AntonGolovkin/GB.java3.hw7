package ru.geekbrains.java3.hw7;

public class MyTest {

    @ru.geekbrains.java3.hw7.BeforeSuite
    public static void test1() {
        System.out.println("test1 BeforeSuite");
    }

    @ru.geekbrains.java3.hw7.Test
    public static void test4() {
        System.out.println("test4");
    }

    @ru.geekbrains.java3.hw7.Test
    public static void test3() {
        System.out.println("test3");
    }

    @ru.geekbrains.java3.hw7.Test(priority = 2)
    public static void test5() {
        System.out.println("test5 priority = 5 ");
    }

    @ru.geekbrains.java3.hw7.Test(priority = 7)
    public static void test2() {
        System.out.println("test2 priority = 2 ");
    }

    @AfterSuite
    public static void test6() {
        System.out.println("test6 AfterSuite");
    }
}
