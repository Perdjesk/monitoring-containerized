graph LR
 promserver("fa:fa-twitter Prometheus Server")
 node-host(node-exporter-host)
 node-container(node-exporter-container)
 grafana(Grafana)
 cadvisor(cAdvisor)
 promserver-.-|pull metrics|node-host
 promserver-.-|pull metrics|node-container
 promserver-.-|pull metrics|cadvisor
 grafana-.-|datasource|promserver
