package spm.spe.ees.demo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {
	@InjectMocks private Application application;
	@Test
	public void main_test(){
		String a = "Hello World 123!";
		String[] args = new String[2];
		Application.main(args);
	}
}
