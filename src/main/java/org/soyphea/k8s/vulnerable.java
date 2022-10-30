protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    try {
           Connection con=new DBConnect().connect(getServletContext().getRealPath("/WEB-INF/config.properties"));
           String email=request.getParameter("email").trim();
           JSONObject json=new JSONObject();
            if(con!=null && !con.isClosed())
            {
                ResultSet rs=null;
                Statement stmt = con.createStatement();
                rs=stmt.executeQuery("select * from users where email='"+email+"'");
            [...]
}

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
}
