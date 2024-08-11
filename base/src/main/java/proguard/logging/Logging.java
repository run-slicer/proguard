/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2021 Guardsquare NV
 */

package proguard.logging;

public class Logging
{
    public static void configureVerbosity(boolean verbose) {
        /*LoggerContext ctx          = (LoggerContext) LogManager.getContext(LogManager.class.getClassLoader(), false);
        Configuration config       = ctx.getConfiguration();
        LoggerConfig  loggerConfig = config.getRootLogger();
        loggerConfig.setLevel(verbose ? Level.INFO : Level.WARN);
        ctx.updateLoggers();*/
    }
}
