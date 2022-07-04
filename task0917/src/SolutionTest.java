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
    public void test(){
        Solution.main(null);
        assertEquals("java.lang.NullPointerException\n" +
                "Solution.method1(Solution.java:24)\n" +
                "Solution.processExceptions(Solution.java:8)\n" +
                "Solution.main(Solution.java:3)\n" +
                "SolutionTest.test(SolutionTest.java:18)\n" +
                "java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\n" +
                "java.base/java.lang.reflect.Method.invoke(Method.java:577)\n" +
                "org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)\n" +
                "org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)\n" +
                "org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)\n" +
                "org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)\n" +
                "org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\n" +
                "org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)\n" +
                "org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)\n" +
                "org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)\n" +
                "org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n" +
                "org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n" +
                "org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n" +
                "org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n" +
                "org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n" +
                "org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n" +
                "org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n" +
                "com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n" +
                "com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n" +
                "com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n" +
                "com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n" +
                "com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n" +
                "com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n", out.toString());
    }

}