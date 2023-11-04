#!/bin/bash

set -o errexit

main() {
  init_db
}

init_db() {
  psql -v ON_ERROR_STOP=1 --username "test" <<-EOSQL
     CREATE DATABASE testdb;
      \connect testdb;
     CREATE SCHEMA test;
EOSQL
}

main "$@"
