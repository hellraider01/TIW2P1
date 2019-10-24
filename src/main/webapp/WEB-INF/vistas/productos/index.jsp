
<jsp:include page="../generico/header.jsp"></jsp:include>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!-- End Navbar -->
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<p class="card-title">Listado de Productos</p>
                                                <a type="button" class="btn btn-primary" href="/backend/product/ver_crear/">Crear Producto</a>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<thead class="text-primary">
									<th>ID</th>
									<th>Nombre</th>
									<th>Precio</th>
									<th>Unidades</th>
									<th>Acciones</th>
								</thead>
								<tbody>
                                                                    <c:forEach items="${productos}" var="producto"> 
									<tr>
										<td>${producto.id}</td>
										<td>${producto.nombre}</td>
										<td>${producto.precio}</td>
										<td>${producto.cantidad}</td>
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