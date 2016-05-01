[![Build Status](https://travis-ci.org/Perdjesk/monitoring-containerized.svg?branch=master)](https://travis-ci.org/Perdjesk/monitoring-containerized)

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
