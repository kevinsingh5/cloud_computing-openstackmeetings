package assign.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/assignment6")
public class SolumApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();
		
	public SolumApplication() {
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		classes.add(SolumResource.class);
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	
}
