package com.cibertec.dao.Impl;

import com.cibertec.dao.PersonaDao;
import com.cibertec.models.Persona;
import com.cibertec.repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements PersonaDao {
    @Override
    public List<Persona> listarPersonas() throws SQLException {
        List<Persona> resultado = new ArrayList<>();
        String query = "SELECT id, nombre, apellido, edad, correo FROM Personas;";

        try(
                Connection connection = DBConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet result = statement.executeQuery();
                ){

            while (result.next()){
                Persona itemPersona = new Persona(
                result.getInt("id"),
                result.getString("nombre"),
                result.getString("apellido"),
                result.getInt("edad"),
                result.getString("correo"),
                result.getString("telefono")

                );
                resultado.add(itemPersona);
            }

        }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
        return resultado;
    }

    @Override
    public Persona obtenerPersona(int id) throws SQLException {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) throws SQLException {

    }

    @Override
    public void editarPersona(Persona persona) throws SQLException {

    }

    @Override
    public void eliminarPersona(int id) throws SQLException {

    }
}
