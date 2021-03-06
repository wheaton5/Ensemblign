package com.heaton.pairwise;

import java.util.List;

import org.biojava3.alignment.template.AbstractPairwiseSequenceAligner;
import org.biojava3.alignment.template.AlignedSequence.Step;
import org.biojava3.alignment.template.Aligner;
import org.biojava3.alignment.template.GapPenalty;
import org.biojava3.alignment.template.MatrixAligner;
import org.biojava3.alignment.template.PairwiseSequenceAligner;
import org.biojava3.alignment.template.PairwiseSequenceScorer;
import org.biojava3.alignment.template.Scorer;
import org.biojava3.alignment.template.SubstitutionMatrix;
import org.biojava3.core.sequence.template.Compound;
import org.biojava3.core.sequence.template.Sequence;

public class HMMAligner<S extends Sequence<C>,C extends Compound> 
	extends AbstractPairwiseSequenceAligner<S,C> implements 
	Aligner<S,C>, MatrixAligner<S,C>, PairwiseSequenceAligner<S,C>, PairwiseSequenceScorer<S,C>, Scorer{
	private double[][] match_matrix;
	private double[][] gap_a;
	private double[][] gap_b;

	public HMMAligner(){
		match_matrix = new double[40][40];
		gap_a = new double[40][40];
		gap_b = new double[40][40];
	}
	
	/**
	 * Prepares an HMMAligner to align a particular sequence and target. For the time being, we will 
	 * assume that the target and sequence are of comparable sizes and an NxM matrix can fit into 
	 * memory.
	 * 
	 * @param query
	 * @param target
	 * @param gapPenalty
	 * @param subMatrix
	 */
	public HMMAligner(S query, S target, GapPenalty gapPenalty, SubstitutionMatrix<C> subMatrix){
		
	}

	@Override
	protected void setProfile(List<Step> arg0, List<Step> arg1) {
		// TODO Auto-generated method stub
		
	}
}
