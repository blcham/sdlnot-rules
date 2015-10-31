#!/bin/bash


if [ -z "$1" ]; then 
	echo Program evaluates SDL-NOT rules using following parameters :
	echo '	-o IRI -- Ontology Logical IRI'
	echo '	-m FILE -- Mapping file for resolving physical URIs of the input ontology and its imports'

	echo '	-d DIR -- Directory with rules that should contain the file "rulespec" with the definition of rules in the following format: <STATE> <RULE_NAME> {<INPUT_ONTOLOGY_IRI> {<OUTPUT_ONTOLOGY_IRI>}}' 
	echo '	-e REGIME -- Entailment regime to be used - valid values are {MIXED|PELLET|ARQ}'
	echo '	-v -- Treat all variables as distinguished ones. This option makes the query result incomplete, but is significantly faster.'
	exit	
fi



DIR=`dirname $(readlink -f $0)`

java -jar "$DIR"/target/sdlnot-rules-cli-0.1.jar $*
