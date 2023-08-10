package com.example.jobListing.Controller;

//import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class PostController {
    // GET method - /allposts - give all the jobs
    // POST method - /posts - submit a new job
    // GET method -/search - search a job

    //every time somone requests for the Home Page
    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

//    public List<Post>
}
