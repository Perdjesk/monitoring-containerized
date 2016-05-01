#!/bin/bash
set -ev

curl --fail http://localhost:3000
curl --fail http://localhost:8080
curl --fail http://localhost:9100
curl --fail http://localhost:9090
curl --fail http://localhost:8500

echo "SUCCESS $0"
