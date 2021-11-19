package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class RuleTest {
	
	@Rule //Significa que esta pasta temporária será criada antes da execução do teste
	public TemporaryFolder tmpFolder =  new TemporaryFolder();
	
	@Test
	public void shouldCreateNewFileTemporaryFolder() throws IOException{
		File created = tmpFolder.newFile("file.text");
		
		assertTrue(created.isFile());
		assertEquals(tmpFolder.getRoot(), created.getParentFile());
	}
}
