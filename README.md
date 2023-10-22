# Guild to use Grafana and Prometheus

## Prerequisites: docker-compose

Step 1: Run the command `docker-compose pull` to pull the images which is located in docker-compose file

Step 2: Run the command `docker-compose up -d` to run the containers.

Step 3: login Prometheus and Grafana
Grafana:
default user: _admin_
default password: _it's configured in docker-compose file_

Step 4: import dashboard model to dashboard csreen in Grafana.
Note that: need to be replaced all word: `"${DS_PROMETHEUS}"` with `app name`