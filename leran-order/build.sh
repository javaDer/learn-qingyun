#!/usr/bin/env bash
mvn package
docker build -t send-service:latest .