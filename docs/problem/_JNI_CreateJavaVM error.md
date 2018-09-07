	/Volumes/CLion/CLion.app/Contents/bin/cmake/mac/bin/cmake --build /Users/xubo/Desktop/xubo/git/c/test/cmake-build-debug --target test -- -j 4
	Scanning dependencies of target test
	[ 20%] Building CXX object CMakeFiles/test.dir/main.cpp.o
	/Users/xubo/Desktop/xubo/git/c/test/main.cpp:17:31: warning: ISO C++11 does not allow conversion from string literal to 'char *' [-Wwritable-strings]
	    options[0].optionString = "-Djava.compiler=NONE";
	                              ^
	/Users/xubo/Desktop/xubo/git/c/test/main.cpp:19:31: warning: ISO C++11 does not allow conversion from string literal to 'char *' [-Wwritable-strings]
	    options[1].optionString = "-Djava.class.path=/Users/xubo/Desktop/xubo/git/c/test";
	                              ^
	/Users/xubo/Desktop/xubo/git/c/test/main.cpp:21:31: warning: ISO C++11 does not allow conversion from string literal to 'char *' [-Wwritable-strings]
	    options[2].optionString = "-verbose:jni";
	                              ^
	/Users/xubo/Desktop/xubo/git/c/test/main.cpp:15:13: warning: expression result unused [-Wunused-value]
	    vm_args.version;
	    ~~~~~~~ ^~~~~~~
	4 warnings generated.
	[ 40%] Linking CXX executable test
	Undefined symbols for architecture x86_64:
	  "_JNI_CreateJavaVM", referenced from:
	      _main in main.cpp.o
	ld: symbol(s) not found for architecture x86_64
	clang: error: linker command failed with exit code 1 (use -v to see invocation)
	make[3]: *** [test] Error 1
	make[2]: *** [CMakeFiles/test.dir/all] Error 2
	make[1]: *** [CMakeFiles/test.dir/rule] Error 2
	make: *** [test] Error 2
