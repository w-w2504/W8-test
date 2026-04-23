import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Calculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

    public static int add(int a, int b) {
        int res=a+b;
        LOGGER.info("a={},b={},res={}",a,b,res);
        return res;
    }

    public static int divide(int a, int b) {
        if (b==0) {
            LOGGER.error("a={},b={}",a,b);
            throw new IllegalArgumentException("b khác 0");
        }
        int res=a/b;
        LOGGER.info("a={},b={},res={}",a,b,res);
        return res;
    }
}