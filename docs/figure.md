graph LR
 promserver("fa:fa-twitter Prometheus Server")
 node-host(node-exporter-host)
 node-container(node-exporter-container)
 grafana(Grafana)
 cadvisor(cAdvisor)
 promserver-.-|scrape|node-host
 promserver-.-|scrape|node-container
 promserver-.-|scrape|cadvisor
 grafana-.-|datasource|promserver
