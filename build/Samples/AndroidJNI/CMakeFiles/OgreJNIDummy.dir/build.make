# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "C:/Program Files/CMake/bin/cmake.exe"

# The command to remove a file.
RM = "C:/Program Files/CMake/bin/cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = E:/work/ogre_1.12.5

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = E:/work/ogre_1.12.5/build

# Include any dependencies generated for this target.
include Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/depend.make

# Include the progress variables for this target.
include Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/progress.make

# Include the compile flags for this target's objects.
include Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/flags.make

Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o: Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/flags.make
Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o: Samples/AndroidJNI/dummyJNI.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o"
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o -c E:/work/ogre_1.12.5/build/Samples/AndroidJNI/dummyJNI.cpp

Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.i"
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E E:/work/ogre_1.12.5/build/Samples/AndroidJNI/dummyJNI.cpp > CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.i

Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.s"
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S E:/work/ogre_1.12.5/build/Samples/AndroidJNI/dummyJNI.cpp -o CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.s

# Object files for target OgreJNIDummy
OgreJNIDummy_OBJECTS = \
"CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o"

# External object files for target OgreJNIDummy
OgreJNIDummy_EXTERNAL_OBJECTS =

lib/libOgreJNIDummy.so: Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/dummyJNI.cpp.o
lib/libOgreJNIDummy.so: Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/build.make
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=E:/work/ogre_1.12.5/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX shared library ../../lib/libOgreJNIDummy.so"
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && "C:/Program Files/CMake/bin/cmake.exe" -E copy_directory E:/work/ogre_1.12.5/build/java E:/work/ogre_1.12.5/build/OgreJNI
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/llvm/prebuilt/windows-x86_64/bin/clang++.exe --target=armv7-none-linux-androideabi --gcc-toolchain=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/toolchains/arm-linux-androideabi-4.9/prebuilt/windows-x86_64 --sysroot=C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot -fPIC -Wall -Winit-self -Wcast-qual -Wwrite-strings -Wextra -Wundef -Wmissing-declarations -Wno-unused-parameter -Wshadow -Wno-missing-field-initializers -Wno-long-long -Wno-inconsistent-missing-override -Wno-missing-braces -isystem C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sysroot/usr/include/arm-linux-androideabi -D__ANDROID_API__=18 -g -DANDROID -ffunction-sections -funwind-tables -fstack-protector-strong -no-canonical-prefixes -march=armv7-a -mfloat-abi=softfp -mfpu=vfpv3-d16 -fno-integrated-as -mthumb -Wa,--noexecstack -Wformat -Werror=format-security -std=c++11  -std=c++11 -O2 -g -DNDEBUG -Wl,--exclude-libs,libgcc.a -Wl,--exclude-libs,libatomic.a --sysroot C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/platforms/android-18/arch-arm -Wl,--build-id -Wl,--warn-shared-textrel -Wl,--fatal-warnings -Wl,--fix-cortex-a8 -Wl,--exclude-libs,libunwind.a -LC:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/cxx-stl/llvm-libc++/libs/armeabi-v7a -Wl,--no-undefined -Wl,-z,noexecstack -Qunused-arguments -Wl,-z,relro -Wl,-z,now  -shared -Wl,-soname,libOgreJNIDummy.so -o ../../lib/libOgreJNIDummy.so $(OgreJNIDummy_OBJECTS) $(OgreJNIDummy_EXTERNAL_OBJECTS)  -latomic -lm "C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/sources/cxx-stl/llvm-libc++/libs/armeabi-v7a/libc++.a" 

# Rule to build all files generated by this target.
Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/build: lib/libOgreJNIDummy.so

.PHONY : Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/build

Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/clean:
	cd E:/work/ogre_1.12.5/build/Samples/AndroidJNI && $(CMAKE_COMMAND) -P CMakeFiles/OgreJNIDummy.dir/cmake_clean.cmake
.PHONY : Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/clean

Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" E:/work/ogre_1.12.5 E:/work/ogre_1.12.5/Samples/AndroidJNI E:/work/ogre_1.12.5/build E:/work/ogre_1.12.5/build/Samples/AndroidJNI E:/work/ogre_1.12.5/build/Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Samples/AndroidJNI/CMakeFiles/OgreJNIDummy.dir/depend

