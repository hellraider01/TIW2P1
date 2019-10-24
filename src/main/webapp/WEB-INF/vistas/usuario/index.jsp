
<jsp:include page="../generico/header.jsp"></jsp:include>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!-- End Navbar -->
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<p class="card-title">Listado de Usuarios</p>
						<a type="button" class="btn btn-primary">Crear Usuario</a>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<thead class="text-primary">
									<th>ID</th>
									<th>Nombre</th>
									<th>Email</th>
									<th>Rol</th>
									<th>Acciones</th>
								</thead>
								<tbody>
                                                                    <c:forEach items="${usuarios}" var="usuario"> 
									<tr>
										<td>${usuario.id}</td>
										<td>${usuario.nombre}</td>
										<td>${usuario.email}</td>
										<td>
                                                                                    <c:if test="${usuario.rol == 0}">
                                                                                        Administrador
                                                                                    </c:if>
                                                                                     <c:if test="${usuario.rol == 1}">
                                                                                        Comprador
                                                                                    </c:if>
                                                                                     <c:if test="${usuario.rol == 2}">
                                                                                        Vendedor
                                                                                    </c:if> 
                                                                                </td>
										<td class="text-primary">$36,738</td>
									</tr>
                                                                    </c:forEach>
									
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../generico/footer.jsp"></jsp:include>