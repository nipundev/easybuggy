package org.t246osslab.easybuggy.exceptions;

import io.github.pixee.security.SystemCommand;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.t246osslab.easybuggy.core.servlets.AbstractServlet;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/itse" })
public class IllegalThreadStateExceptionServlet extends AbstractServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Runtime rt = Runtime.getRuntime();
        Process proc = SystemCommand.runCommand(rt, "javac");
        proc.exitValue();
    }
}
