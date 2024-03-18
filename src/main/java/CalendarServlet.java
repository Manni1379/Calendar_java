// src/main/java/CalendarServlet.java

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calendar")
public class CalendarServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Calendar</title></head><body>");
        out.println("<h1>Calendar</h1>");
        // Here you can generate and display your calendar HTML content
        // For simplicity, let's just display a static calendar
        out.println("<table border=\"1\">");
        out.println("<tr><th>Sun</th><th>Mon</th><th>Tue</th><th>Wed</th><th>Thu</th><th>Fri</th><th>Sat</th></tr>");
        // Dummy calendar content
        out.println("<tr><td></td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td><td>6</td></tr>");
        out.println("<tr><td>7</td><td>8</td><td>9</td><td>10</td><td>11</td><td>12</td><td>13</td></tr>");
        out.println("<tr><td>14</td><td>15</td><td>16</td><td>17</td><td>18</td><td>19</td><td>20</td></tr>");
        out.println("<tr><td>21</td><td>22</td><td>23</td><td>24</td><td>25</td><td>26</td><td>27</td></tr>");
        out.println("<tr><td>28</td><td>29</td><td>30</td><td>31</td><td></td><td></td><td></td></tr>");
        out.println("</table>");
        out.println("</body></html>");
    }
}

