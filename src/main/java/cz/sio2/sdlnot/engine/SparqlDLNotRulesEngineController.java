package cz.sio2.sdlnot.engine;

import java.net.URI;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import cz.sio2.sdlnot.model.QueryEngineType;
import cz.sio2.sdlnot.model.RuleSpec;

public interface SparqlDLNotRulesEngineController {
	
	public OWLOntologyManager getOWLOntologyManager();
	
	public void setStatus( String status );
	
	public void updateOntology( final OWLOntology generatedOntology, final OWLOntology mergedOntology, final IRI generatedOntologyIRI, final URI physicalURI );
	
	public QueryEngineType getQueryEngineType();

	public boolean isTreatAllVariablesDistinguished();
	
	public RuleSpec getRuleSpec();
}