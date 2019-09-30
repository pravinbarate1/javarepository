package com.rh.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/RequestLoggingFilter")
public class RequestLoggingFilter implements Filter {

	private ServletContext context;
    
    public RequestLoggingFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		HttpServletRequest req = (HttpServletRequest) request;
		
		Enumeration<String> params = req.getParameterNames();
		
		while(params.hasMoreElements()) {
			String name = params.nextElement();
			String value = params.nextElement();
			this.context.log(req.getRemoteAddr()+" ::Request Params::{"+name+"="+value+"}");
		}
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				this.context.log(req.getRemoteAddr()+"::Cookie::{"+cookie.getName()+","+cookie.getValue()+"}");
			}
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("RequestLogginFilter Initialized");
	}

}
