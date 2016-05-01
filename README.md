[![Build Status](https://travis-ci.org/Perdjesk/monitoring-containerized.svg?branch=master)](https://travis-ci.org/Perdjesk/monitoring-containerized)

# Overview

![Overview](/docs/figure.md.png)

# Usage

```
./create-cluster.sh
```

| Component           | URL                     |
| ---                 | ---                     |
| Grafana             | http://localhost:3000  |
| Prometheus server   | http://localhost:9090   |
| Host node-exporter  | http://localhost:9100   |
| cAdvisor            | http://localhost:8080   |



# Prerequisites

Docker engine >= 1.10.0
