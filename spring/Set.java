package com;
import org.springframework.stereotype.Component;

@Component
public class Set {
private Cohorts c;
private DXC d;
public Set(Cohorts c, DXC d)
{
	this.c = c;
	this.d = d;
}
public void  display()
{
	System.out.println("coherent");
	System.out.println(c.cohortid);
	System.out.println(c.cohortname);
	System.out.println(c.emailid);
	System.out.println(c.number);
}
}