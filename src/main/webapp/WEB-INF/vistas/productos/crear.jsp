
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
                                            <form class="form-horizontal" method="POST" action="/backend/product/crear" enctype="multipart/form-data">
							<fieldset>
								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="textinput">Nombre</label>
									<div class="col-md-4">
										<input id="textinput" name="nombre" type="text" placeholder=""
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="textinput">Resumen</label>
									<div class="col-md-4">
										<input id="textinput" name="resumen" type="text"
											placeholder="" class="form-control input-md">

									</div>
								</div>

								<!-- Textarea -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="textarea">Descripcion
										Larga</label>
									<div class="col-md-4">
										<textarea class="form-control" id="textarea"
											name="descripcion"></textarea>
									</div>
								</div>

								<div class="">
									<label class="col-md-4 control-label" for="textarea">
										Imagen local </label>
									<div class="col-md-4">
										<input id="textinput" name="file" type="file"
											class="form-control input-md">
									</div>
								</div>

								<!-- Select Basic -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="selectbasic">Categoria</label>
									<div class="col-md-4">
										<select id="selectbasic" name="categoria" class="form-control">
                                                                                    <c:forEach items="${categorias}" var="categoria"> 
											<option value="${categoria.id}">${categoria.nombre}</option>
                                                                                    </c:forEach>
										</select>
									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="textinput">Unidades</label>
									<div class="col-md-4">
										<input id="textinput" name="unidades" type="number" step="any"
											placeholder="" class="form-control input-md">

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