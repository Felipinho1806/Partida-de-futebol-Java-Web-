package controller;

import model.Match;
import model.Team;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/matchController")
public class matchController extends HttpServlet{
    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Match m1 = new Match();
        Team t1 = new Team();
        Team t2 = new Team();

        String home = request.getParameter("home");
        t1.setName(home);
        m1.setHome(t1);

        String away = request.getParameter("visitor");
        t2.setName(away);
        m1.setVisitor(t2);

        String x = request.getParameter("homeScore");
        int homeScore = Integer.parseInt(x);
        m1.setHomeScore(homeScore);

        String y = request.getParameter("awayScore");
        int awayScore = Integer.parseInt(y);
        m1.setAwayScore(awayScore);
    }
}
