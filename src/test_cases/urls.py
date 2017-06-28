"""Hakuna-Matata url's."""


from django.conf.urls import url
from . import views

urlpatterns = (
    url(r'^$', view=views.project_view, name="projects"),
    url(r'^(?P<project_id>\d+)/usecases$', view=views.usecases_view, name="usecases"),
    url(r'^(?P<project_id>\d+)/usecases/actions/(?P<usecase_id>\d+)$', view=views.actions_view, name="actions"),
    url(r'^reports/$', view=views.reports_view, name="reports"),
    url(r'^report/(?P<report_id>\d+)$', view=views.render_report, name="report"),
    url(r'^add_project/$', views.add_project, name='add_project'),
    url(r'^remove_project/(?P<project_id>\d+)/$', views.remove_project, name='remove_project'),
)
