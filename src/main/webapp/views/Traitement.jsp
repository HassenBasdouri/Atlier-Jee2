<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<form:form method="post" modelAttribute="enseignant" action="${pageContext.request.contextPath}/addEnseignant">
<table>
		<tr>
			<th colspan="2">Add Enseignant</th>
		</tr>
		<tr>
	<form:hidden path="id" />
          <td><form:label path="nom">Enseignant Name:</form:label></td>
          <td><form:input path="nom" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			<td colspan="2"><input type="submit" value="Excuter"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Enseignant List</h3>
<c:if test="${! empty listOfEnseignants}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Enseignant Name</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
		<th width="60">Schedule</th>
	</tr>
	<c:forEach items="${listOfEnseignants}" var="enseignant">
		<tr>
			<td>${enseignant.id}</td>
			<td>${enseignant.nom}</td>
			<td><a href="<c:url value="/updateEnseignant/${enseignant.id}" />" >Edit</a></td>
			<td><a href="<c:url value="/deleteEnseignant/${enseignant.id}" />" >Delete</a></td>
			<td><a href="<c:url value="/scheduleEnseignant/${enseignant.id}" />" >Schedule</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<form:form method="post" modelAttribute="salle" action="${pageContext.request.contextPath}/addSalle">
<table>
		<tr>
			<th colspan="2">Add Salle</th>
		</tr>
		<tr>
	<form:hidden path="id_Sa" />
          <tr><td><form:label path="dataShow">Data show :</form:label></td>
          <td><form:checkbox path="dataShow" /></td></tr>
          <tr><td><form:label path="nb_places">Nomber de place</form:label></td>
          <td><form:input type="number" path="nb_places" size="3"></form:input></td></tr>
          <tr><td><form:label path="reference">Reference</form:label></td>
          <td><form:input type="text" path="reference" ></form:input></td>
        </tr>
		<tr>
			<td colspan="2"><input type="submit" value="Excuter"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Salle List</h3>
<c:if test="${! empty listOfSalles}">
	<table class="tg">
	<tr> 
		<th width="80">D</th>
		<th width="120">Data show</th>
		<th width="120">nomber de palce</th>
		<th width="120">Reference</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfSalles}" var="salle">
		<tr>
			<td>${salle.id_Sa}</td>
			<td>${salle.dataShow}</td>
			<td>${salle.nb_places}</td>
			<td>${salle.reference}</td>
			<td><a href="<c:url value='/updateSalle/${salle.id_Sa}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteSalle/${salle.id_Sa}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<form:form method="post" modelAttribute="matiere" action="${pageContext.request.contextPath}/addMatiere">
<table>
		<tr>
			<th colspan="2">Add Matiere</th>
		</tr>
		<tr>
	<form:hidden path="id_Ma" />
          <tr><td><form:label path="libelle">Libelle :</form:label></td>
          <td><form:input path="Libelle" /></td></tr>
          <tr><td><form:label path="coefficient">Coefficient</form:label></td>
          <td><form:input type="number" path="coefficient" min="1" max="5"/></td></tr>
        </tr>
		<tr>
			<td colspan="2"><input type="submit" value="Excuter"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Matiere List</h3>
<c:if test="${! empty listOfMatieres}">
	<table class="tg">
	<tr> 
		<th width="80">ID</th>
		<th width="120">Libelle</th>
		<th width="120">coefficient</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfMatieres}" var="matiere">
		<tr>
			<td>${matiere.id_Ma}</td>
			<td>${matiere.libelle}</td>
			<td>${matiere.coefficient}</td>
			<td><a href="<c:url value='/updateMatiere/${matiere.id_Ma}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteMatiere/${matiere.id_Ma}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
<form:form method="post" modelAttribute="seance" action="${pageContext.request.contextPath}/addSeance">
<table>
		<tr>
			<th colspan="2">Add Seance</th>
		</tr>
		<tr>
	<form:hidden path="id_Sea" />
          <tr><td><form:label path="matiere.id_Ma">Matiere :</form:label></td>
          <td><form:select path="matiere.id_Ma">
          <c:forEach items="${listOfMatieres}" var="matiere">
          <option value="${matiere.id_Ma}">${matiere.libelle}</option>
          </c:forEach>
          </form:select></td></tr>
          
          <tr><td><form:label path="enseignant.id">Enseignant :</form:label></td>
          <td><form:select path="enseignant.id">
          <c:forEach items="${listOfEnseignants}" var="enseignant">
          <option value="${enseignant.id}">${enseignant.nom}</option>
          </c:forEach>
          </form:select></td></tr>
          
          <tr><td><form:label path="salle.id_Sa">Salle :</form:label></td>
          <td><form:select path="salle.id_Sa">
          <c:forEach items="${listOfSalles}" var="salle">
          <option value="${salle.id_Sa}">${salle.reference}</option>
          </c:forEach>
          </form:select></td></tr>
          
          <tr><td><form:label path="type">Type :</form:label></td>
          <td><form:select path="type">
          <c:forEach items="${seance.getTypes()}" var="type">
          <option value="${type}">${type}</option>
          </c:forEach>
          </form:select></td></tr>
          
          <tr><td><form:label path="heureDebut">Heure Debut</form:label></td>
          <td><form:input type="time" min="09:00" max="18:00" path="heureDebut"/></td></tr>
          
           <tr><td><form:label path="heureFin">Heure Fin</form:label></td>
          <td><form:input type="time" min="09:00" max="18:00"  path="heureFin"/></td></tr>
          
          <tr><td><form:label path="jour">Jour :</form:label></td>
          <td><form:select path="jour">
          <option value="1">Lundi</option>
          <option value="2">Mardi</option>
          <option value="3">Mercredi</option>
          <option value="4">Jeudi</option>
          <option value="5">Vendredi</option>
          <option value="6">Samedi</option>
          </form:select></td></tr>
          
		<tr>
			<td colspan="2"><input type="submit" value="Excuter"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</body>
</html>