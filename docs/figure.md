graph TD
 promserver("fa:fa-twitter Prometheus Server")
 node-host(node-exporter-host)
 node-container(node-exporter-container)
 grafana(Grafana)
 cadvisor(cAdvisor)
 consul(consul)
 registrator(Registrator)
 promserver-.-|pull metrics|node-host
 promserver-.-|pull metrics|node-container
 promserver-.-|pull metrics|cadvisor
 consul-->|get targets|promserver
 registrator-->|announces containers|consul
 grafana-.-|datasource|promserver
