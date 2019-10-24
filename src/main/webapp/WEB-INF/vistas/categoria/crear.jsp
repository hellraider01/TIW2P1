
<jsp:include page="../generico/header.jsp"></jsp:include>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!-- End Navbar -->
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header card-header-primary">
                        <p class="card-title">Nuevo Producto</p>
                    </div>
                    <div class="card-body">
                        <form class="form-horizontal" method="POST" action="/backend/categoria/crear">
                            <fieldset>
                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="textinput">Nombre</label>
                                    <div class="col-md-4">
                                        <input id="textinput" name="nombre" type="text" placeholder=""
                                               class="form-control input-md">

                                    </div>
                                </div>     

                                <!-- Select Basic -->
                                <div class="form-group">
                                    <label class="col-md-4 control-label" for="selectbasic">Categoria Padre</label>
                                    <div class="col-md-4">
                                        <select id="selectbasic" name="idCat" class="form-control">
                                                <option value="-1">Ninguna</option>
                                            <c:forEach items="${categorias}" var="categoria"> 
                                                <option value="${categoria.id}">${categoria.nombre}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>              

                                <div class="form-group">
                                    <div class="col-md-4">
                                        <button id="singlebutton" type="submit"
                                                class="btn btn-primary">Guardar</button>
                                    </div>
                                </div>

                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="../generico/footer.jsp"></jsp:include>