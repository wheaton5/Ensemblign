package com.heaton.pairwise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.compound.AminoAcidCompound;
import org.biojava3.core.sequence.compound.AminoAcidCompoundSet;
import org.biojava3.core.sequence.io.FastaReader;
import org.biojava3.core.sequence.io.GenericFastaHeaderParser;
import org.biojava3.core.sequence.io.ProteinSequenceCreator;
import org.biojava3.core.sequence.template.Compound;
import org.biojava3.core.sequence.template.Sequence;
import org.junit.*;
public class HMMAlignerTest {

	
	@Test
	public void loadFasta(){
		FileInputStream inStream;
		try {
			inStream = new FileInputStream( "./resources/test/java/com/heaton/pairwise/3.fa" );
			FastaReader<ProteinSequence,AminoAcidCompound> fastaReader = 
					new FastaReader<ProteinSequence,AminoAcidCompound>(
							inStream, 
							new GenericFastaHeaderParser<ProteinSequence,AminoAcidCompound>(), 
							new ProteinSequenceCreator(AminoAcidCompoundSet.getAminoAcidCompoundSet()));
			LinkedHashMap<String, ProteinSequence> seq = fastaReader.process();
			for(String s: seq.keySet()){
				System.out.println(s+": "+seq.get(s));
			}
			//TODO do some checking, also actually test something we dont care about testing biojava
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
