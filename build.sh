#!/bin/bash

ROOT=$(pwd)
SRC_DIR=$ROOT/src
CLASS_DIR=$ROOT/class
MAIN_CLASS_NAME=ListFruitsMain
ARGS=2

mkdir $SRC_DIR $CLASS_DIR &> /dev/null

function clean {
  rm -rf $CLASS_DIR/*
}

function build {
  for file in $(find "$SRC_DIR" -type f); do
    javac -d $CLASS_DIR -sourcepath $SRC_DIR $file
  done
}

function run {
  cd $CLASS_DIR
  java $MAIN_CLASS_NAME $ARGS
}

clean
build
run

