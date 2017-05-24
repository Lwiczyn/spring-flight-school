@!/bin/bash

set -e -x

pushd spring-flight-school
	mvn clean package
	mvn test
popd