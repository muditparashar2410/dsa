package utils;

public class RuntimeComplexity {
    private static long startTime;
    private static long startMemory;
    public static void start(){
        startTime = System.currentTimeMillis();
        startMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static void stop(){
        long endTime = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long runtime = endTime - startTime;
        long spaceUsed = endMemory - startMemory;

        System.out.println("Program runtime: " + runtime + " milliseconds");
        System.out.println("Space complexity: " + spaceUsed + " bytes");
    }
}
