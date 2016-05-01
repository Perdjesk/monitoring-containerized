#!/bin/bash
set -ev

curl --fail localhost:3000
curl --fail localhost:8080
curl --fail localhost:9100
curl --fail localhost:9090

echo "SUCCESS $0"
