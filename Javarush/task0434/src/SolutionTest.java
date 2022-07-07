import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }

    @Test
    public void tableMult() {
        Solution.tableMult();
        assertEquals("\t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9 \n" +
                              "\t2 \t4 \t6 \t8 \t10 \t12 \t14 \t16 \t18 \n" +
                              "\t3 \t6 \t9 \t12 \t15 \t18 \t21 \t24 \t27 \n" +
                              "\t4 \t8 \t12 \t16 \t20 \t24 \t28 \t32 \t36 \n" +
                              "\t5 \t10 \t15 \t20 \t25 \t30 \t35 \t40 \t45 \n" +
                              "\t6 \t12 \t18 \t24 \t30 \t36 \t42 \t48 \t54 \n" +
                              "\t7 \t14 \t21 \t28 \t35 \t42 \t49 \t56 \t63 \n" +
                              "\t8 \t16 \t24 \t32 \t40 \t48 \t56 \t64 \t72 \n" +
                              "\t9 \t18 \t27 \t36 \t45 \t54 \t63 \t72 \t81 \n", out.toString());
    }
}