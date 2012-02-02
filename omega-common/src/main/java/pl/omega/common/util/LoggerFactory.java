package pl.omega.common.util;

import org.apache.log4j.Logger;

/**
 * A factory for creating Log instances conveniently. By using this class it is no longer necessary
 * to provide a class when creating a Log instance.
 * 
 * @author Marek Puchalski
 */
public class LoggerFactory
{

    private LoggerFactory()
    { /* nothing */ }

    /**
     * Creates a commons logging Log instance. The log instance is initialized with the class calling
     * this method.
     * 
     * @return A commons logging Log instance.
     */
    public static Logger create()
    {
        Throwable t = new Throwable();
        StackTraceElement directCaller = t.getStackTrace()[1];
        return Logger.getLogger(directCaller.getClassName());
    }

}
