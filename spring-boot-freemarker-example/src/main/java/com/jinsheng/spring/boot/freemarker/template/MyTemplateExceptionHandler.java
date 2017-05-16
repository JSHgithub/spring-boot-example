package com.jinsheng.spring.boot.freemarker.template;

import freemarker.core.Environment;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;

/**
 * @author jinsheng
 */
public class MyTemplateExceptionHandler implements TemplateExceptionHandler {

    public void handleTemplateException(TemplateException te, Environment env, java.io.Writer out)
            throws TemplateException {
        try {
            out.write("[ERROR: " + te.getMessage() + "]");
        } catch (IOException e) {
            throw new TemplateException("Failed to print error message. Cause: " + e, env);
        }
    }
}
