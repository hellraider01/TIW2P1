<jsp:include page="../generico/header.jsp"></jsp:include>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!-- End Navbar -->
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<p class="card-title">Listado de Categorias</p>
                                                <a type="button" href="/backend/categoria/ver_crear" class="btn btn-primary">Crear Categoria</a>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<thead class="text-primary">
									<th>ID</th>
									<th>Nombre</th>
                                                                        <th>Hijos</th>
									<th>Acciones</th>
								</thead>
								<tbody>
									<c:forEach items="${categorias}" var="categoria"> 
									<tr>
										<td>${categoria.id}</td>
										<td>${categoria.nombre}</td>
                                                                                <td>${categoria.hijas.size()}</td>
										<td class="text-primary">$56,142</td>
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