package controllers;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


import static services.UserService.IMAGES_BASE_CAT;


@WebServlet("/imagepage/*")
public class PictureServlet extends HttpServlet {
    private static final Logger logger=Logger.getLogger(PictureServlet.class.getSimpleName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Run: void doGet(HttpServletRequest req, HttpServletResponse resp) ");
        String URLAfterWebDomain = req.getRequestURI();
        if(URLAfterWebDomain.startsWith("/imagepage/") == false)
            return;
        String relativeImagePath = URLAfterWebDomain.substring("/imagepage/".length());
        resp.setContentType("image/jpeg");
        ServletOutputStream outStream;
        outStream = resp.getOutputStream();
        FileInputStream fin = new FileInputStream(IMAGES_BASE_CAT+relativeImagePath);

        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(outStream);
        int ch =0; ;
        while((ch=bin.read())!=-1)
            bout.write(ch);

        bin.close();
        fin.close();
        bout.close();
        outStream.close();

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Run: void doPost(HttpServletRequest req, HttpServletResponse resp) ");
        doGet(req, resp);
    }
}
