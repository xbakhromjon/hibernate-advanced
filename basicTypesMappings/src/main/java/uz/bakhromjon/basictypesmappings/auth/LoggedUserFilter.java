package uz.bakhromjon.basictypesmappings.auth;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class LoggedUserFilter implements Filter {

    @Override
    public void init(
            FilterConfig filterConfig)
            throws ServletException {
    }

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain filterChain)
            throws IOException, ServletException {

        try {
            HttpServletRequest httpServletRequest =
                    (HttpServletRequest) request;

            LoggedUser.logIn(
                    httpServletRequest.getRemoteUser()
            );

            filterChain.doFilter(request, response);
        }
        finally {
            LoggedUser.logOut();
        }
    }

    @Override
    public void destroy() {
    }
}