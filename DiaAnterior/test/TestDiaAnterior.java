/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import diaanterior.DiaAnterior;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author alumne
 */
@RunWith(Parameterized.class)
public class TestDiaAnterior {
    
     @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { "29/2/2000",1,2,2000 },{ "30/3/2000",31,2,2000 } ,{ "31/12/1999",1,0,2000 } 
           });
    }

    private String expected;
    private int day;
    private int month;
    private int year;
    public TestDiaAnterior (String expected,int day,int month,int year){
        this.expected=expected;
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    
     @Test
     public void converRomanosTest() {
     DiaAnterior fe = new DiaAnterior(this.day, this.month,this.year);
     fe.restarDia();
     assertEquals(expected,fe.fechaAyer());
     
     }
}
