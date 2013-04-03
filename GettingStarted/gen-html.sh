#!/bin/bash

pandoc -s -f markdown INSTRUCTIONS.md -t html5 -c training.css > INSTRUCTIONS.html

