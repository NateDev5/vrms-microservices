#!/bin/sh
set -e
SPRING_BOOT_VERSION="4.0.2"
JAVA_VERSION="17"
PROJECT_VERSION="0.0.1-SNAPSHOT"

generate_service() {
  SERVICE_NAME="$1"
  PACKAGE_NAME="$2"
  GROUP_ID="$3"
  DEPENDENCIES="$4"

  if [ -d "$SERVICE_NAME" ]; then
    echo "Skipping $SERVICE_NAME (already exists)"
    return
  fi

  echo "Generating $SERVICE_NAME ..."
  spring init \
    --boot-version="$SPRING_BOOT_VERSION" \
    --build=gradle \
    --type=gradle-project \
    --java-version="$JAVA_VERSION" \
    --packaging=jar \
    --name="$SERVICE_NAME" \
    --package-name="$PACKAGE_NAME" \
    --groupId="$GROUP_ID" \
    --dependencies="$DEPENDENCIES" \
    --version="$PROJECT_VERSION" \
    "$SERVICE_NAME"
}

generate_service "api-gateway" "com.nate.vrms.gateway" "com.nate" "web,validation"
generate_service "cars-service" "com.nate.vrms.cars" "com.nate" "web,validation"
generate_service "owners-service" "com.nate.vrms.owners" "com.nate" "web,validation"
generate_service "agents-service" "com.nate.vrms.agents" "com.nate" "web,validation"
generate_service "registration-service" "com.nate.vrms.registration" "com.nate" "web,validation"

echo
echo "All service skeletons generated successfully."
