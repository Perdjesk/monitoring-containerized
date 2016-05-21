[![Build Status](https://travis-ci.org/Perdjesk/monitoring-containerized.svg?branch=master)](https://travis-ci.org/Perdjesk/monitoring-containerized)

The goal is to provide a simple way to create a 'working out of the box' playground around monitoring tools:
- Grafana, for metrics visualization with provided dashboards.
- Prometheus, to collect metrics from various exporter (node, cadvisor).
- cAdvisor, to expose container metrics.
- consul, to feed Prometheus with new targets to scrape.
- Registrator, for announcing all host's containers to consul.


Requirements
- docker-engine  >= 1.10.0
- docker-compose >= 1.6.0



# Overview

<img src="/docs/figure.md.png" width="80%">

# Usage

```
./create-cluster.sh
```

| Component           | URL                     |
| ---                 | ---                     |
| Grafana             | http://localhost:3000   |
| Prometheus server   | http://localhost:9090   |
| Host node-exporter  | http://localhost:9100   |
| cAdvisor            | http://localhost:8080   |
| consul              | http://localhost:8500   |
