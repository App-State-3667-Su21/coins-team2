JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_COMMAND =  -jar checkstyle-5.5-all.jar

compile: $(JUNIT5_JAR)
	javac -cp .:$(JUNIT5_JAR) *.java
	
clean:
	rm -f *~
	rm -f *.class
	
check:
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml *.java
	
test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path