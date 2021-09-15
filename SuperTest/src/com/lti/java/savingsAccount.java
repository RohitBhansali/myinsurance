package com.lti.java;
//import org.junit.jupiter.api.Assertions; if we give this the Assertion.assertNotNull if we use static assertNotNull
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class savingsAccount {
    static savingsac savingsAccount;// = Bank.getObject();
    @BeforeAll
    static void iitialize(){
        savingsAccount = Bank.getObject();
        System.out.println("Object created");
    }
    @BeforeEach
    void setup(){
        System.out.println("setup()");
        System.out.println("Run each time");
        System.out.println("thanos is here");
    }
    @Test
    public void testwithdraw() {
        String st="LTi";//null; error for null
        byte a[]=st.getBytes();
        assertTrue(a.length>0);
        for (int x:a
        ) {
            System.out.println("x :"+(char)x);
        }

        int array[]={1,2,3};
        assertTrue(array.length>0);
        for (int x:array
        ) {
            System.out.println("x :"+x);
        }
        System.out.println("test started   :withdraw");
        assertTrue(14 > 5);
        System.out.println("passed1");
        assertTrue(24 > 5);
        System.out.println("passed2");
        assertTrue(34 > 5);
        System.out.println("passed3");
        savingsac s = new savingsac(101, "dr", 555);
        System.out.println("s :" + s);
    }
    @Test
    public void testDeposit(){
        System.out.println("Testing the deposit() method");
        System.out.println("Creating object...");
        assertNotNull(savingsAccount);
        System.out.println("Object created..."+savingsAccount.hashCode());
        double balanceBeforeDeposit = savingsAccount.getAcBal();
        System.out.println("Invoking method");
        double amountToBeDeposited = 3000;
        savingsAccount.deposit(amountToBeDeposited);
        assertEquals(balanceBeforeDeposit+amountToBeDeposited,  savingsAccount.getAcBal());
        System.out.println(savingsAccount);
        System.out.println("Method succeeded ..");
    }
    //@RepeatedTest(4)
    @Test
    public void testWithdraw(){
        System.out.println("Testing the withdraw() method");
        System.out.println("Creating object...");
        assertNotNull(savingsAccount);
        System.out.println("Object created..."+savingsAccount.hashCode());
        double balanceBeforeDeposit = savingsAccount.getAcBal();
        System.out.println("Invoking method");
        double amountToWithdraw = 11000;
        Throwable throwable= assertThrows(RuntimeException.class,()->
                savingsAccount.withdraw(amountToWithdraw));
        assertEquals("",throwable.getMessage());
        assertEquals(balanceBeforeDeposit-amountToWithdraw,  savingsAccount.getAcBal());
        System.out.println(savingsAccount);
        System.out.println("Method succeeded ..");
    }

}