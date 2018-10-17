export JAVA_HOME=/opt/jdk1.6.0
export CXF_HOME=/home/psalinas/Desktop/Downloads/spring/bin/apache-cxf-2.2
export PATH=$CXF_HOME/bin:$JAVA_HOME/bin:$PATH

wsdl2java -p http://b2b.falabella.com/schemas/ol/entrega-documento-request=cl.falabella.b2b.intol.ws.entregadocumento.beans.request -p http://b2b.falabella.com/service/ol/entrega-documento=cl.falabella.b2b.intol.ws.entregadocumento.service -p http://b2b.falabella.com/schemas/ol/entrega-documento-response=cl.falabella.b2b.intol.ws.entregadocumento.beans.response b2b-ol-entrega-documento-service.wsdl

wsdl2java -p http://b2b.falabella.com/schemas/ol/info-palet-request=cl.falabella.b2b.intol.ws.infopalet.beans.request -p http://b2b.falabella.com/service/ol/info-palet=cl.falabella.b2b.intol.ws.infopalet.service -p http://b2b.falabella.com/schemas/ol/info-palet-response=cl.falabella.b2b.intol.ws.infopalet.beans.response b2b-ol-info-palet-service.wsdl

wsdl2java -p http://b2b.falabella.com/schemas/ol/info-documento-request=cl.falabella.b2b.intol.ws.infodocumento.beans.request -p http://b2b.falabella.com/service/ol/info-documento=cl.falabella.b2b.intol.ws.infodocumento.service -p http://b2b.falabella.com/schemas/ol/info-documento-response=cl.falabella.b2b.intol.ws.infodocumento.beans.response b2b-ol-info-documento-service.wsdl

wsdl2java -p http://b2b.falabella.com/schemas/ol/admin-archivo-carga-request=cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.request -p http://b2b.falabella.com/schemas/ol/admin-archivo-carga-response=cl.falabella.b2b.intol.ws.adminarchivo.beans.carga.response -p http://b2b.falabella.com/schemas/ol/admin-archivo-descarga-request=cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.request -p http://b2b.falabella.com/schemas/ol/admin-archivo-descarga-response=cl.falabella.b2b.intol.ws.adminarchivo.beans.descarga.response -p http://b2b.falabella.com/schemas/ol/admin-archivo-consulta-request=cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.request -p http://b2b.falabella.com/schemas/ol/admin-archivo-consulta-response=cl.falabella.b2b.intol.ws.adminarchivo.beans.consulta.response -p http://b2b.falabella.com/service/ol/admin-archivo=cl.falabella.b2b.intol.ws.adminarchivo.service b2b-ol-admin-archivo-service.wsdl

wsdl2java -p http://b2b.falabella.com/schemas/ol/ventaverde-muelles=cl.falabella.b2b.intol.ws.agendaventaverde.beans.consmuelles -p http://b2b.falabella.com/schemas/ol/ventaverde-ventanas=cl.falabella.b2b.intol.ws.agendaventaverde.beans.consventanas -p http://b2b.falabella.com/schemas/ol/ventaverde-agenda=cl.falabella.b2b.intol.ws.agendaventaverde.beans.agenda -p http://b2b.falabella.com/service/ol/agenda-ventaverde=cl.falabella.b2b.intol.ws.agendaventaverde.service b2b-ol-agenda-ventaverde-service.wsdl

xjc -p cl.falabella.b2b.intol.beans.infopalet b2b-ol-info-palet-database.xsd
