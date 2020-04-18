<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script>document.getElementsByTagName("html")[0].className += " js";</script>
  <link rel="stylesheet" href="/css/styleScheldule.css">
  <title>Schedule of ${enseignant.nom}</title>
</head>
<body>
  <header class="cd-main-header text-center flex flex-column flex-center">
    <h1 class="text-xl">Schedule of ${enseignant.nom}</h1>
  </header>

  <div class="cd-schedule cd-schedule--loading margin-top-lg margin-bottom-lg js-cd-schedule">
    <div class="cd-schedule__timeline">
      <ul>
        <li><span>09:00</span></li>
        <li><span>09:30</span></li>
        <li><span>10:00</span></li>
        <li><span>10:30</span></li>
        <li><span>11:00</span></li>
        <li><span>11:30</span></li>
        <li><span>12:00</span></li>
        <li><span>12:30</span></li>
        <li><span>13:00</span></li>
        <li><span>13:30</span></li>
        <li><span>14:00</span></li>
        <li><span>14:30</span></li>
        <li><span>15:00</span></li>
        <li><span>15:30</span></li>
        <li><span>16:00</span></li>
        <li><span>16:30</span></li>
        <li><span>17:00</span></li>
        <li><span>17:30</span></li>
        <li><span>18:00</span></li>
      </ul>
    </div> <!-- .cd-schedule__timeline -->
  
    <div class="cd-schedule__events">
      <ul>
          <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Lundi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==1}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
                  <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Mardi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==2}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
                  <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Mercredi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==3}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
                  <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Jeudi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==4}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
                  <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Vendredi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==5}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
                  <li class="cd-schedule__group">
          <div class="cd-schedule__top-info"><span>Samedi</span></div>
          <ul>
          <c:forEach items="${enseignant.seances}" var="seance">
          <c:if test="${seance.jour==6}">
             <li class="cd-schedule__event">
              <a data-start="${seance.heureDebut}" data-end="${seance.heureFin}" data-content="event-abs-circuit" data-event="event-<%= (int) (Math.random() *4+1) %>" href="#0">
                <em class="cd-schedule__name">${seance.matiere.libelle}</em>
              </a>
            </li>
          </c:if>
          </c:forEach>
          </ul>
        </li>
      </ul>
    </div>
  
    <div class="cd-schedule-modal">
      <header class="cd-schedule-modal__header">
        <div class="cd-schedule-modal__content">
          <span class="cd-schedule-modal__date"></span>
          <h3 class="cd-schedule-modal__name"></h3>
        </div>
  
        <div class="cd-schedule-modal__header-bg"></div>
      </header>
  
      <div class="cd-schedule-modal__body">
        <div class="cd-schedule-modal__event-info"></div>
        <div class="cd-schedule-modal__body-bg"></div>
      </div>
  
      <a href="#0" class="cd-schedule-modal__close text-replace">Close</a>
    </div>
  
    <div class="cd-schedule__cover-layer"></div>
  </div> <!-- .cd-schedule -->

  <script src="/js/util.js"></script> <!-- util functions included in the CodyHouse framework -->
  <script src="/js/main.js"></script>
</body>
</html>