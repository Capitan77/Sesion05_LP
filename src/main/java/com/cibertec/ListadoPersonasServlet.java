package com.cibertec;

import com.cibertec.dao.Impl.PersonaDaoImpl;
import com.cibertec.dao.PersonaDao;
import com.cibertec.models.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListadoPersonasServlet", urlPatterns = {"/","/personas"})
public class ListadoPersonasServlet extends HttpServlet {

    private final PersonaDao personaDao = new PersonaDaoImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            List<Persona> lista = personaDao.listarPersonas();
            req.setAttribute("personas",lista);
            req.getRequestDispatcher("personas.jsp").forward(req,resp);

        }catch (SQLException error){
            throw new ServletException("Error a listar: ", error);
        }
    }
}
