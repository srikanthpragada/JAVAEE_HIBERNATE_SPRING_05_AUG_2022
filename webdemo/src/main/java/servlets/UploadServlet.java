package servlets;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Part p1 = request.getPart("mobilefile");
			InputStream is = p1.getInputStream();
			TreeSet<String> mobiles = new TreeSet<>();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			out.println("<h2>Mobile Numbers </h2>");
			out.println("<ul>");
			while (true) {
				String line = br.readLine();
				if (line == null) // EOF
					break;
				String numbers[] = line.split(",");
				for (String num : numbers) {
					if(Pattern.matches("\\d+", num))
					      mobiles.add(num);
				}
					
			}
			for (String number : mobiles)
				out.println("<li>" + number + "</li>");

			out.println("</ul>");
		} catch (Exception ex) {
			System.out.println("Error -> " + ex.getMessage());
		}

	}

}
