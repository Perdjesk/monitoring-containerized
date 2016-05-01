#!/bin/sh

set -e
  
export DOCKER_HOST_IP=$(ip route | awk '/docker/ { print $NF }')
docker-compose stop
docker-compose rm -f
docker-compose up -d --force-recreate
sleep 5
sh ./grafana/provision-grafana.sh
