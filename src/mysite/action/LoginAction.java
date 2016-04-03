package mysite.action;

import mysite.dao.UserDao;
import mysite.vo.UserVo;
import db.WebDBConnection;
import web.WebUtil;
import web.action.Action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginAction implements Action {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        String email = req.getParameter("email");
        String passwd = req.getParameter("passwd");

        UserVo userVo = new UserVo();
        userVo.setEmail(email);
        userVo.setPasswd(passwd);

        UserDao userDao = new UserDao(new WebDBConnection());
        UserVo authUser = userDao.get(userVo);

        if (authUser == null) {
            WebUtil.forward(
                req, res, "/WEB-INF/mysite/views/user/loginform_fail.jsp");
            return;
        }

        HttpSession httpSession = req.getSession(true);
        httpSession.setAttribute("authUser", authUser);
        WebUtil.redirect(req, res, "/main");
    }
}
