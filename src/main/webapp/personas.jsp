<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>personas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="p-3 mb-2 bg-body-secondary">

      <div class="container mt-5">

               <h1 class="p-3 mb-2 bg-info-subtle text-info-emphasis card shadow-lg p-3 mb-5 bg-body-tertiary rounded mx-auto p-2"
               style="width: 600px;">Personas Registradas</h1>

               <table class="table table-hover table-bordered border border-info-subtle ">
                     <thead >
                           <th>ID</th>
                           <th>Nombre</th>
                           <th>Apellido</th>
                           <th>Edad</th>
                           <th>Correo</th>
                           <th>Telefono</th>
                     </thead>
                     <tbody>
                           <c:forEach items = "${personas}" var="item">

                              <tr>
                                  <td>${item.getId()}</td>
                                  <td>${item.getNombre()}</td>
                                  <td>${item.getApellido()}</td>
                                  <td>${item.getEdad()}</td>
                                  <td>${item.getCorreo()}</td>
                                  <td>${item.getTelefono()}</td>
                              </tr>

                           </c:forEach>
                     </tbody>
               </table>

      </div>



</body>
</html>