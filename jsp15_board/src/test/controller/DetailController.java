package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.dao.BoardDAO;
import test.vo.BoardVo;

@WebServlet("/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDAO dao = new BoardDAO();
		BoardVo vo = dao.detail(num);
		String content = vo.getContent();
		content=content.replaceAll("\n", "<br>");
		vo.setContent(content);
		req.setAttribute("vo", vo);
		req.getRequestDispatcher("/detail.jsp").forward(req, resp);
	}
}
