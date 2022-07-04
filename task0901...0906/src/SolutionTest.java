import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setOut(){ System.setOut(new PrintStream(out)); }


    //task0901=======================
    @Test
    public void method1() {
        assertEquals("[java.base/java.lang.Thread.getStackTrace(Thread.java:1610), Solution.method1(Solution.java:6), SolutionTest.method1(SolutionTest.java:15), java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104), java.base/java.lang.reflect.Method.invoke(Method.java:577), org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50), org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12), org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47), org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17), org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57), org.junit.runners.ParentRunner$3.run(ParentRunner.java:290), org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71), org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288), org.junit.runners.ParentRunner.access$000(ParentRunner.java:58), org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268), org.junit.runners.ParentRunner.run(ParentRunner.java:363), org.junit.runner.JUnitCore.run(JUnitCore.java:137), com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69), com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38), com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11), com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35), com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235), com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)]",
                Arrays.toString(Solution.method1()));
    }

    @Test
    public void method2() {
        assertEquals("[java.base/java.lang.Thread.getStackTrace(Thread.java:1610), Solution.method1(Solution.java:6), SolutionTest.method2(SolutionTest.java:21), java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104), java.base/java.lang.reflect.Method.invoke(Method.java:577), org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50), org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12), org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47), org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17), org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57), org.junit.runners.ParentRunner$3.run(ParentRunner.java:290), org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71), org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288), org.junit.runners.ParentRunner.access$000(ParentRunner.java:58), org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268), org.junit.runners.ParentRunner.run(ParentRunner.java:363), org.junit.runner.JUnitCore.run(JUnitCore.java:137), com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69), com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38), com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11), com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35), com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235), com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)]",
                Arrays.toString(Solution.method1()));
    }

    @Test
    public void method3() {
        assertEquals("[java.base/java.lang.Thread.getStackTrace(Thread.java:1610), Solution.method1(Solution.java:6), SolutionTest.method3(SolutionTest.java:27), java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104), java.base/java.lang.reflect.Method.invoke(Method.java:577), org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50), org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12), org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47), org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17), org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57), org.junit.runners.ParentRunner$3.run(ParentRunner.java:290), org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71), org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288), org.junit.runners.ParentRunner.access$000(ParentRunner.java:58), org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268), org.junit.runners.ParentRunner.run(ParentRunner.java:363), org.junit.runner.JUnitCore.run(JUnitCore.java:137), com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69), com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38), com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11), com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35), com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235), com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)]",
                Arrays.toString(Solution.method1()));
    }

    @Test
    public void method4() {
        assertEquals("[java.base/java.lang.Thread.getStackTrace(Thread.java:1610), Solution.method1(Solution.java:6), SolutionTest.method4(SolutionTest.java:33), java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104), java.base/java.lang.reflect.Method.invoke(Method.java:577), org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50), org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12), org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47), org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17), org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57), org.junit.runners.ParentRunner$3.run(ParentRunner.java:290), org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71), org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288), org.junit.runners.ParentRunner.access$000(ParentRunner.java:58), org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268), org.junit.runners.ParentRunner.run(ParentRunner.java:363), org.junit.runner.JUnitCore.run(JUnitCore.java:137), com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69), com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38), com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11), com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35), com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235), com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)]",
                Arrays.toString(Solution.method1()));
    }

    @Test
    public void method5() {
        assertEquals("[java.base/java.lang.Thread.getStackTrace(Thread.java:1610), Solution.method1(Solution.java:6), SolutionTest.method5(SolutionTest.java:39), java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104), java.base/java.lang.reflect.Method.invoke(Method.java:577), org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50), org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12), org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47), org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17), org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78), org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57), org.junit.runners.ParentRunner$3.run(ParentRunner.java:290), org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71), org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288), org.junit.runners.ParentRunner.access$000(ParentRunner.java:58), org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268), org.junit.runners.ParentRunner.run(ParentRunner.java:363), org.junit.runner.JUnitCore.run(JUnitCore.java:137), com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69), com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38), com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11), com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35), com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235), com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)]",
                Arrays.toString(Solution.method1()));
    }

    //task0902=================================
    @Test
    public void task0902(){
        Solution.method01();
        assertEquals("java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                        "java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                        "java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                        "java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                        "java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n",
                out.toString());
    }

    //task0903======================================
    @Test
    public void testTask0903(){
        Solution.method001();
        assertEquals("1610\n" +
                        "1610\n" +
                        "1610\n" +
                        "1610\n" +
                        "1610\n",
                out.toString());
    }

    //task0904=============================
    @Test
    public void testTask0904(){
        StackTraceElement[] ste = Solution.m1();
        assertEquals(33, ste.length);
    }

    //task0905==========================================
    @Test
    public void testTask0905(){
        assertEquals(26, Solution.m01());
        assertEquals("java.base/java.lang.Thread.getStackTrace(Thread.java:1610)\n" +
                "Solution.m01(Solution.java:132)\n" +
                "SolutionTest.testTask0905(SolutionTest.java:83)\n" +
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
                "com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n",
                out.toString());
    }

    //task0906================================================
    @Test
    public void testTask0906(){
        Solution.log("msg");
        assertEquals("Solution: testTask0906: msg\n", out.toString());
    }
}