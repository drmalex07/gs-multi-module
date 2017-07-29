# README - Multi-Module Example

## Build

Build and package all submodules:

    mvn clean package install

## Generate site

Generate site for parent project and all submodules (will generate site into `target/multi-site`):

    mvn site site:deploy


